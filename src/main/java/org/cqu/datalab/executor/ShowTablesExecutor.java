package org.cqu.datalab.executor;

import org.cqu.datalab.utils.DbHolder;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.List;

public class ShowTablesExecutor implements AbstractExecutor {
    @Override
    public void execute() {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        if (!DbHolder.getInstance().selected()) {
            System.out.println("Error: No database selected.");
            return;
        }
        List<String> tables = accessor.getAllTable(DbHolder.getInstance().getDatabaseName());
        System.out.println("Table_name");
        System.out.println("----------");

        tables.forEach(System.out::println);

        System.out.println(tables.size() + " rows in set.");
        System.out.println();
    }
}
