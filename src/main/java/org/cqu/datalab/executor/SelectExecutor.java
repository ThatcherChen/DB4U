package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SelectExecutor implements AbstractExecutor{
    private final String tableName;
    private final List<String> identifiers;
    public SelectExecutor(String tableName, List<String> identifiers) {
        this.identifiers = identifiers;
        this.tableName = tableName;
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

            // For star
            if (identifiers.size() == 1 && "*".equals(identifiers.get(0))) {
                identifiers.clear();
                identifiers.addAll(allColumnNames);
            }

            // Check before generate result
            if (!new HashSet<>(allColumnNames).containsAll(identifiers)) {
                System.out.println("Error: Some properties do not exist.");
                return;
            }

            // Output column name
            identifiers.forEach((identifier) -> {
                System.out.print(" " + identifier);
            });

            System.out.println();

            List<String> result = fetchBackTable.select((line) -> {
                String[] propertyGroup = line.split(",");
                return identifiers.stream()
                        .map((identifier) -> propertyGroup[allColumnNames.indexOf(identifier)])
                        .reduce("", ((s, s2) -> s + " " + s2));
            }, (any) -> true);

            result.forEach(System.out::println);
        } else {
            System.out.println("Error: Table " + tableName + " does not exist.");
        }
    }
}
