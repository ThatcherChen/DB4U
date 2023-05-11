package org.cqu.datalab.utils;

import org.cqu.datalab.data.Table;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DatabaseAccessor {
    public static final String DEFAULT_BASEDIR = "./database/";
    private final String baseDir;

    public DatabaseAccessor() {
        baseDir = DEFAULT_BASEDIR;
    }

    public DatabaseAccessor(String baseDir) {
        this.baseDir = baseDir;
    }

    public static void initDatabase() {
        try {
            File base = new File(DEFAULT_BASEDIR);
            File meta = new File(MetaDataAccessor.DEFAULT_METADATA);
            if (!base.exists()) {
                base.mkdirs();
            }
            if (!meta.exists()) {
                meta.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean initDatabase(String preset) {
        try {
            File base = new File(preset);
            File meta = new File(preset + "metaData.csv");
            if (!base.exists()) {
                base.mkdirs();
            }
            if (!meta.exists()) {
                meta.createNewFile();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Table getTable(String tableName) {
        MetaDataAccessor metaDataAccessor = MetaDataAccessor.getAccessor();
        Map<String, String> property = metaDataAccessor.getTableProperty(tableName);
        if (property != null) {
            String fileName = property.get("FileName");
            File tableFile = new File(baseDir + fileName);
            try {
                return new Table(tableFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void createTable(String tableName, List<String> columnsWithType) {
        MetaDataAccessor metaDataAccessor = MetaDataAccessor.getAccessor();
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
                tableFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dropTable(String tableName) {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        Map<String, String> property = accessor.getTableProperty(tableName);
        if (property != null) {
            File tableFile = new File(baseDir + property.get("FileName"));
            accessor.dropTableProperty(tableName);
            tableFile.delete();
        }
    }
}
