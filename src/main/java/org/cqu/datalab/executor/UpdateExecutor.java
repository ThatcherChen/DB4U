package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.*;
import java.util.stream.Collectors;

public class UpdateExecutor implements AbstractExecutor{
    private final String tableName;
    private final String updateString;
    private final String rawCondition;
    public UpdateExecutor(String tableName, String updateString, String rawCondition) {
        this.tableName = tableName;
        this.updateString = updateString;
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

            Map<String, String> updateInfo = new HashMap<>();
            Arrays.stream(updateString.split("/")).forEach((item) -> {
                String varName = item.split(",")[0];
                String valueAndType = item.split(",")[1];
                updateInfo.put(varName, valueAndType);
            });

            // type check
            Map<String, String> varType = new HashMap<>();
            Arrays.stream(metaDataAccessor.getTableProperty(tableName).get("Columns").split("/"))
                    .forEach((varTypePair) -> {
                        String[] varAndType = varTypePair.split(":");
                        varType.put(varAndType[0], varAndType[1]);
                    });
            for (Map.Entry<String, String> keyVal : updateInfo.entrySet()) {
                String inputType = keyVal.getValue().split(":")[1];
                String typeShouldBe = varType.getOrDefault(keyVal.getKey(), "NULL");
                if (typeShouldBe.equals("NULL")) {
                    System.out.println("Error: \"" + keyVal.getKey() + "\" property does not exists.");
                    return;
                }
                if (!inputType.equals(typeShouldBe)) {
                    System.out.println("Error: Type does not match");
                    return;
                }
            }

            Map<Integer, String> assignList = new HashMap<>();
            updateInfo.forEach((key, value) -> assignList.put(allColumnNames.indexOf(key), value.split(":")[0]));
            long affectedRows = fetchBackTable.update(assignList, WhereClauseHandler.generateFilter(rawCondition, allColumnNames));

            System.out.println("Query OK, " + affectedRows + " rows affected.");
            System.out.println();

        } else {
            System.out.println("Error: Table " + tableName + " does not exist.");
        }
    }
}
