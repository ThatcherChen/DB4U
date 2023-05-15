package org.cqu.datalab.executor;

import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.List;

public class ShowDatabasesExecutor implements AbstractExecutor {
    @Override
    public void execute() {
        MetaDataAccessor accessor = MetaDataAccessor.getAccessor();
        List<String> databases = accessor.getAllDatabases();
        System.out.println("Databases");
        System.out.println("---------");
        databases.forEach(System.out::println);
        System.out.println(databases.size() + " rows in set.");
    }
}
