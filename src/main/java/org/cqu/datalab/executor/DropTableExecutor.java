package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.DbHolder;

public class DropTableExecutor implements AbstractExecutor{
    private final String tableName;
    public DropTableExecutor(String tableName) {
        this.tableName = tableName;
    }
    @Override
    public void execute() {
        DatabaseAccessor accessor = new DatabaseAccessor();
        if (!DbHolder.getInstance().selected()) {
            System.out.println("Error: No database selected.");
            return;
        }
        accessor.dropTable(tableName, DbHolder.getInstance().getDatabaseName());
    }
}
