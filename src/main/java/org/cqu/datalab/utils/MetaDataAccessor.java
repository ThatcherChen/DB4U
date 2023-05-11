package org.cqu.datalab.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MetaDataAccessor {
    public static final String DEFAULT_METADATA = DatabaseAccessor.DEFAULT_BASEDIR + "metaData.csv";
    private static final int SYNC_BOUND_COUNT = 0;
    private static final MetaDataAccessor accessor = new MetaDataAccessor();
    private final String metaData;
    private final FileInputStream metaDataInput;
    private final StringBuffer metaBuffer = new StringBuffer();
    private int changeCount = 0;

    public static MetaDataAccessor getAccessor() {
        return accessor;
    }

    public MetaDataAccessor() throws ExceptionInInitializerError{
        metaData = DEFAULT_METADATA;
        try {
            metaDataInput = new FileInputStream(metaData);
            loadIntoBuffer();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError();
        }
    }

    public MetaDataAccessor(String metaData) throws ExceptionInInitializerError{
        this.metaData = metaData;
        try {
            metaDataInput = new FileInputStream(metaData);
            loadIntoBuffer();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError();
        }
    }

    private void loadIntoBuffer() throws IOException {
        byte[] bytes = new byte[512];
        int readBytes = 0;
        while (metaDataInput.available() > 0) {
            readBytes += metaDataInput.read(bytes);
            String tmpStr = new String(bytes, 0, readBytes, StandardCharsets.UTF_8);
            metaBuffer.append(tmpStr);
        }
    }

    public void sync() {
        try {
            FileOutputStream metaDataOutput = new FileOutputStream(metaData);
            metaDataOutput.write(metaBuffer.toString().getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getTableProperty(String tableName) {
        if (tableName == null) return null;
        try {
            Scanner scanner = new Scanner(metaBuffer.toString());
            Map<String, String> propertyMap = new HashMap<>();
            while (scanner.hasNext()) {
                String[] curLine = scanner.nextLine().split(",");
                if (tableName.equals(curLine[1])) {
                    List<String> tableProperty = Arrays.asList(curLine);
                    propertyMap.put("FileName", tableProperty.get(0));
                    propertyMap.put("TableName", tableProperty.get(1));
                    propertyMap.put("Columns", tableProperty.get(2));
                    return propertyMap;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertTableProperty(Map<String, String> tableProperty) {
        try {
            String row = tableProperty.get("FileName") + "," +
                    tableProperty.get("TableName") + "," +
                    tableProperty.get("Columns") + "\n";
            metaBuffer.append(row);
            changeCount += 1;
            if (changeCount >= SYNC_BOUND_COUNT) {
                sync();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dropTableProperty(String tableName) {
        Scanner scanner = new Scanner(metaBuffer.toString());
        while (scanner.hasNext()) {
            String[] curLine = scanner.nextLine().split(",");
            if (curLine[1].equals(tableName)) {
                int start = metaBuffer.indexOf(curLine[0]);
                int end = metaBuffer.indexOf("\n", start);
                metaBuffer.delete(start, end+1);
                changeCount += 1;
                if (changeCount >= SYNC_BOUND_COUNT) {
                    sync();
                }
            }
        }
    }
}
