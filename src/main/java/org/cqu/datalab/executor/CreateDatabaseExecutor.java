package org.cqu.datalab.executor;

import org.cqu.datalab.utils.MetaDataAccessor;

public class CreateDatabaseExecutor implements AbstractExecutor {
    private final String databaseName;
    public CreateDatabaseExecutor(String databaseName) {
        this.databaseName = databaseName;
    }
    @Override
    public void execute() {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        accessor.insertDb(databaseName);
        accessor.sync();
    }
}
