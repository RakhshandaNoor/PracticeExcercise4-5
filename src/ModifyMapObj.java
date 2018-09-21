import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ModifyMapObj {
    Map<String, String> modify(Map<String,String> a){
        a.replace("val2",a.get("val2"),a.get("val1"));
        a.replace("val1",a.get("val1")," ");


 return a;

    }

    public static void main(String[] args) {

        Map<String,String> values= new TreeMap<>();
        values.put("val1","java");
        values.put("val2", "c++");
        System.out.println(values);
        ModifyMapObj m = new ModifyMapObj();
        Map<String,String> mod ;
        mod= m.modify(values);

        System.out.println(mod);
    }
}
