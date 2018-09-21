import java.util.HashMap;
import java.util.Map;

public class CountString {

    public static void main(String[] args) {

        String str = "one one -one___two,,three,one @three*one?two";
        //String[] s= str.split("[\\s-$&+,:;_=?@#|'<>.^*()%!]");
        String[] s = str.split("[^A-Za-z]");

        Map<String,Integer> freq = new HashMap<>();
        for (String s1 : s) {

            if (freq.get(s1) == null) {
                freq.put(s1, 1);
            } else {
                freq.put(s1,freq.get(s1)+1);
            }

        }
        freq.remove("");

        for(String st : s)
        System.out.println(st);
        System.out.println(freq);
    }
}
