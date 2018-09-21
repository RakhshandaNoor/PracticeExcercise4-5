import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceOfWord {

    void find(String s, String key){

        Pattern pattern= Pattern.compile(key);
        Matcher matcher= pattern.matcher(s);


        while(matcher.find()){

            System.out.println( "Found at:" + matcher.start()+" - "+matcher.end());

        }

    }

    public static void main(String[] args) {
        String s="She sells seashells by the seashore ";
        String key= "se";
        MultipleOccurenceOfWord m= new MultipleOccurenceOfWord();
         m.find(s,key);
    }
}
