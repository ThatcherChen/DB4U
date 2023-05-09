package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        if (valueList.size() != accessor.getTableProperty(tableName).get("Columns").split("/").length) {
            System.out.println("Error: number of values does not match");
            return;
        }
        List<String> rowType = Arrays.stream(accessor.getTableProperty(tableName).get("Columns").split("/"))
                .map((varWithType) -> varWithType.split(":")[1])
                .collect(Collectors.toList());
        for (int i = 0; i < valueList.size(); i++) {
            if (!valueList.get(i).split(":")[1].equals(rowType.get(i))) {
                System.out.println("Error: Find type does not match.");
                return;
            }
        }

        // Type check passed, clean type information
        List<String> var = valueList.stream().map((valueAndType) -> valueAndType.split(":")[0]).collect(Collectors.toList());

        DatabaseAccessor databaseAccessor = new DatabaseAccessor();
        Table table = databaseAccessor.getTable(tableName);

        table.insert(var);
    }
}
