package org.cqu.datalab.utils;

public class DbHolder {
    private static final DbHolder dbHolder = new DbHolder();
    private String databaseName = "";

    public static DbHolder getInstance() {
        return dbHolder;
    }

    public void setDatabaseName(String databaseName) {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        if (accessor.dbExists(databaseName)) this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public boolean selected() {
        return !databaseName.isEmpty();
    }
}
