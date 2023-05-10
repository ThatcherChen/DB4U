package org.cqu.datalab.executor;

import java.util.List;
import java.util.function.Predicate;

public class WhereClauseHandler {
    public static Predicate<String> generateFilter(String rawCondition, List<String> allColumnNames) {
        Predicate<String> result;
        String[] infoArr = rawCondition.split(",");
        String property = infoArr[0], op = infoArr[1], val = infoArr[2];
        switch (op) {
            case "=":
                result = (line) -> {
                    String curVal = line.split(",")[allColumnNames.indexOf(property)];
                    return Integer.parseInt(curVal) == Integer.parseInt(val);
                };
                break;
            case "<":
                result = (line) -> {
                    String curVal = line.split(",")[allColumnNames.indexOf(property)];
                    return Integer.parseInt(curVal) < Integer.parseInt(val);
                };
                break;
            case ">":
                result = (line) -> {
                    String curVal = line.split(",")[allColumnNames.indexOf(property)];
                    return Integer.parseInt(curVal) > Integer.parseInt(val);
                };
                break;
            case ">=":
                result = (line) -> {
                    String curVal = line.split(",")[allColumnNames.indexOf(property)];
                    return Integer.parseInt(curVal) >= Integer.parseInt(val);
                };
                break;
            case "<=":
                result = (line) -> {
                    String curVal = line.split(",")[allColumnNames.indexOf(property)];
                    return Integer.parseInt(curVal) <= Integer.parseInt(val);
                };
                break;
            default:
                result = (any) -> true;
                break;
        }
        return result;
    }
}
