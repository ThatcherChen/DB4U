package org.cqu.datalab.executor;

import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShowtablesExecutor implements AbstractExecutor{
    @Override
    public void execute() {
        MetaDataAccessor metaDataAccessor = MetaDataAccessor.getAccessor();
        List<String> allTableNames = metaDataAccessor.getAllTableNames();
        allTableNames.forEach(System.out::println);
    }
}