package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DbHolder;
import org.cqu.datalab.utils.MetaDataAccessor;

public class UseExecutor implements AbstractExecutor{
    private final String dbName;
    public UseExecutor (String dbName) {
        this.dbName = dbName;
    }
    @Override
    public void execute() {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        if (accessor.dbExists(dbName)) {
            DbHolder.getInstance().setDatabaseName(dbName);
            System.out.println("Database changed.");
        }
        else {
            System.out.println("Error: database \"" + dbName + "\" does not exists.");
        }
    }
}
