import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {

    public boolean check(String s){

        if(s.split("[H|h]arry").length>1){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println("enter the string");
        PresenceOfName presenceOfName= new PresenceOfName();
        Scanner scanner= new Scanner(System.in);
        boolean b=presenceOfName.check(scanner.nextLine());
        if(b){
            System.out.println("harry is present");
        }
        else{
            System.out.println("harry is not present");
        }
    }
}
