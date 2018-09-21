import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

    Map<String, Boolean> frequency(String s) {
        Map<String, Boolean> freq = new HashMap<>();
        String[] str = s.split("");
        for (String s1 : str) {

            if (freq.get(s1) == null) {
                freq.put(s1, false);
            } else {
                freq.put(s1, true);
            }

        }
        return freq;
    }

    public static void main(String[] args) {
        Map<String, Boolean> a= (new OccurenceOfChar().frequency("Hello World is outdated"));
        System.out.println(a);
    }
}



