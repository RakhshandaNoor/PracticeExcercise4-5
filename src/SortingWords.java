import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingWords {

    public static void main(String[] args) {
        String s= "Hello from Java. Are you a programmer?";
        String[] a= s.split(" ");
        List<String> b=Arrays.asList(a);
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);

    }
}
