import java.util.*;

public class NamesAscending {

    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        System.out.println("enter the num");
        int x= new Scanner(System.in).nextInt();
        System.out.println("enter names");
        for(int i=0;i<x;i++)
        {
            names.add(new Scanner(System.in).next());
        }
        System.out.println(names);

        List<String> arrayNames = new ArrayList<>(names);

        System.out.println(arrayNames);

    }
}
