import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Replacing {

    public static void main(String[] args) {
        String str1= "daily dry";
        String str2= str1.replaceAll("d","f").replaceAll("l","t");
        System.out.println(str2);

    }
}
