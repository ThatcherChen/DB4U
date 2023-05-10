package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DeleteExecutor implements AbstractExecutor {
    private final String tableName;
    private final String rawCondition;
    public DeleteExecutor(String tableName, String rawCondition) {
        this.tableName = tableName;
        this.rawCondition = rawCondition;
    }
    @Override
    public void execute() {
        DatabaseAccessor accessor = new DatabaseAccessor();
        MetaDataAccessor metaDataAccessor = MetaDataAccessor.getAccessor();
        Table fetchBackTable = accessor.getTable(tableName);
        if (fetchBackTable != null) {
            List<String> allColumnNames = Arrays
                    .stream(metaDataAccessor.getTableProperty(tableName).get("Columns").split("/"))
                    .map((varWithType) -> varWithType.substring(0, varWithType.indexOf(':')))
                    .collect(Collectors.toList());

            Predicate<String> filter = (any) -> true;

            if (!rawCondition.isEmpty()) filter = WhereClauseHandler.generateFilter(rawCondition, allColumnNames);

            long affectedRows = fetchBackTable.delete(filter);

            System.out.println("Query OK, " + affectedRows + " rows affected.");
            System.out.println();

        } else {
            System.out.println("Error: Table " + tableName + " does not exist.");
        }
    }
}
