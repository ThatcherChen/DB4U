package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.List;

public class InsertExecutor implements AbstractExecutor{
    private final String tableName;
    private final List<String> valueList;
    public InsertExecutor(String tableName, List<String> valueList) {
        this.valueList = valueList;
        this.tableName = tableName;
    }
    @Override
    public void execute() {
        // type check
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        if (valueList.size() != accessor.getTableProperty(tableName).get("Columns").split(",").length) {
            System.out.println("Error: number of values does not match");
        }

        DatabaseAccessor databaseAccessor = new DatabaseAccessor();
        Table table = databaseAccessor.getTable(tableName);

        table.insert(valueList);
    }
}
