import java.util.Comparator;

public class StudentSorter implements Comparator<StudentDetails> {


    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {

        if(o2.getAge() == o1.getAge()){
            if(o2.getName().equals(o1.getName())){
                return o2.getId()- o1.getId();
            }
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getAge()-o1.getAge();
    }
}
