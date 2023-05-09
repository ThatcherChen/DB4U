package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DatabaseAccessor;

public class DropTableExecutor implements AbstractExecutor{
    private final String tableName;
    public DropTableExecutor(String tableName) {
        this.tableName = tableName;
    }
    @Override
    public void execute() {
        DatabaseAccessor accessor = new DatabaseAccessor();
        accessor.dropTable(tableName);
    }
}
