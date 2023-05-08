package org.cqu.datalab.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MetaDataAccessor {
    private static final String DEFAULT_METADATA = "/home/czc/WorkSpace/DataProject2/database/metaData.csv";
    private static final int SYNC_BOUND_COUNT = 5;
    private final String metaData;
    private final FileInputStream metaDataInput;
    private final FileOutputStream metaDataOutput;
    private final StringBuffer metaBuffer = new StringBuffer();
    private int changeCount = 0;

    public MetaDataAccessor() throws ExceptionInInitializerError{
        metaData = DEFAULT_METADATA;
        try {
            metaDataInput = new FileInputStream(metaData);
            metaDataOutput = new FileOutputStream(metaData);
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
            metaDataOutput = new FileOutputStream(metaData);
            loadIntoBuffer();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError();
        }
    }

    private void loadIntoBuffer() {
        Scanner tmpScanner = new Scanner(metaDataInput);
        while (tmpScanner.hasNext()) metaBuffer.append(tmpScanner.nextLine());
    }

    public boolean sync() {
        try {
            metaDataOutput.write(metaBuffer.toString().getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean init() {
        try {
            File metaDataFile = new File(DEFAULT_METADATA);
            if (!metaDataFile.exists()) {
                return metaDataFile.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean init(String preset) {
        try {
            File metaDataFile = new File(preset);
            if (!metaDataFile.exists()) {
                return metaDataFile.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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

    public boolean insertTableProperty(Map<String, String> tableProperty) {
        try {
            String row = tableProperty.get("FileName") + "," +
                    tableProperty.get("TableName") + "," +
                    tableProperty.get("Columns") + "\n";
            metaBuffer.append(row);
            changeCount += 1;
            if (changeCount >= SYNC_BOUND_COUNT) {
                sync();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean dropTableProperty(String tableName) {
        Scanner scanner = new Scanner(metaBuffer.toString());
        boolean dropStatus = false;
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
                dropStatus = true;
            }
        }
        return dropStatus;
    }
}