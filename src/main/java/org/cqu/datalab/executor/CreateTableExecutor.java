package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.DbHolder;

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
        if (!DbHolder.getInstance().selected()) System.out.println("Error: No database selected.");
        else {
            accessor.createTable(tableName, columns, DbHolder.getInstance().getDatabaseName());
        }
    }
}
