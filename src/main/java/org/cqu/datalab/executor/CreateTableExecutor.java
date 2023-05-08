package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DatabaseAccessor;

import java.util.List;

public class CreateTableExecutor implements AbstractExecutor {
    private final String tableName;
    private final List<String> columns;
    public CreateTableExecutor(String tableName, List<String> columns) {
        this.tableName = tableName;
        this.columns = columns;
    }
    @Override
    public void execute() {
        DatabaseAccessor accessor = new DatabaseAccessor();
        accessor.createTable(tableName, columns);
    }
}
