import org.cqu.datalab.utils.DatabaseAccessor;
import org.cqu.datalab.utils.MetaDataAccessor;

import java.util.HashMap;
import java.util.Map;

public class MetaTest {
    public static void main(String[] args) {
        DatabaseAccessor.initDatabase();
        MetaDataAccessor.init();
        MetaDataAccessor metaDataAccessor = new MetaDataAccessor();
        Map<String, String> property = new HashMap<>();
        property.put("FileName", "ABC.csv");
        property.put("TableName", "abc");
        property.put("Columns", "name:String/age:Int");
        metaDataAccessor.insertTableProperty(property);
        metaDataAccessor.insertTableProperty(property);
        metaDataAccessor.dropTableProperty("abc");
        metaDataAccessor.insertTableProperty(property);
        metaDataAccessor.insertTableProperty(property);
        metaDataAccessor.sync();
    }
}
