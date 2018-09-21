import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest {

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails(316, "john", 23);
        StudentDetails s2 = new StudentDetails(102, "mary", 21);
        StudentDetails s3 = new StudentDetails(201,"john", 23);
        StudentDetails s4 = new StudentDetails(308, "mary", 23);

        StudentDetails s5 = new StudentDetails(317, "daizy", 20);

        List<StudentDetails> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        stud.add(s5);

        Collections.sort(stud, new StudentSorter());
        System.out.println(stud.toString());

    }

}
