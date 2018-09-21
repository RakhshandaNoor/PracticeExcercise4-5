import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateArray {

    public static void main(String[] args) {

        List<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Lemon");
        fruits.add("Berry");
        fruits.add("Apple");

        System.out.println("Initial Array "+fruits);

        Iterator iterator= fruits.iterator();

//        for(String s: fruits){
        while(iterator.hasNext()){

                int a= fruits.indexOf("Apple");
                fruits.set(a,"kiwi");
                int b= fruits.indexOf("Lemon");
                fruits.set(b,"Mango");

        }

        System.out.println("Modified array"+ fruits);
        fruits.removeAll(fruits);
        System.out.println("empty array"+ fruits);

    }
}
