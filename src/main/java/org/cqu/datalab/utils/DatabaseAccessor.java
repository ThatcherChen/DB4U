package org.cqu.datalab.utils;

import org.cqu.datalab.data.Table;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DatabaseAccessor {
    private static final String DEFAULT_BASEDIR = "/home/czc/WorkSpace/DataProject2/database/";
    private final String baseDir;

    public DatabaseAccessor() {
        baseDir = DEFAULT_BASEDIR;
    }

    public DatabaseAccessor(String baseDir) {
        this.baseDir = baseDir;
    }

    public static boolean initDatabase() {
        try {
            File base = new File(DEFAULT_BASEDIR);
            if (!base.exists()) {
                return base.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean initDatabase(String preset) {
        try {
            File base = new File(preset);
            if (!base.exists()) {
                return base.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Table getTable(String tableName) {
        MetaDataAccessor metaDataAccessor = new MetaDataAccessor();
        Map<String, String> property = metaDataAccessor.getTableProperty(tableName);
        if (property != null) {
            String fileName = property.get("FileName");
            File tableFile = new File(fileName);
            FileInputStream inputStream;
            FileOutputStream outputStream;
            try {
                inputStream = new FileInputStream(tableFile);
                outputStream = new FileOutputStream(tableFile, true);
                return new Table(tableFile, inputStream, outputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean createTable(String tableName, List<String> columnsWithType) {
        MetaDataAccessor metaDataAccessor = new MetaDataAccessor();
        Map<String, String> property = metaDataAccessor.getTableProperty(tableName);
        if (property == null) {
            Random random = new Random();
            String fileName = String.valueOf(random.nextInt());
            File tableFile = new File(baseDir + fileName);
            try {
                Map<String, String> tableProperty = new HashMap<>();
                tableProperty.put("FileName", fileName);
                tableProperty.put("TableName", tableName);
                StringBuilder columnStringBuilder = new StringBuilder();
                for (String column : columnsWithType) {
                    columnStringBuilder.append(column);
                    columnStringBuilder.append("/");
                }
                columnStringBuilder.deleteCharAt(columnStringBuilder.length()-1);
                tableProperty.put("Columns", columnStringBuilder.toString());
                metaDataAccessor.insertTableProperty(tableProperty);
                metaDataAccessor.sync();
                return tableFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean dropTable(String tableName) {
        MetaDataAccessor accessor = new MetaDataAccessor();
        Map<String, String> property = accessor.getTableProperty(tableName);
        if (property != null) {
            File tableFile = new File(property.get("FileName"));
            accessor.dropTableProperty(tableName);
            accessor.sync();
            return tableFile.delete();
        }
        return false;
    }
}
