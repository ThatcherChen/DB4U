import org.cqu.datalab.data.Table;
import org.cqu.datalab.utils.DatabaseAccessor;

import java.util.ArrayList;
import java.util.List;

public class TableTest {
    public static void main(String[] args) throws Exception {
        DatabaseAccessor accessor = new DatabaseAccessor();
        List<String> columns = new ArrayList<>();
        columns.add("name:String");
        columns.add("age:Int");
        accessor.createTable("Test", columns);
    }
}
