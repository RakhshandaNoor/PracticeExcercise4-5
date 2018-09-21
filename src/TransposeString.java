public class TransposeString {

    public static void main(String[] args) {
        String s= "a quick brown fox jumps over the lazy dog";
        String[] str= s.split(" ");

        String t="";
        for(String s1: str){
            StringBuilder stringBuilder= new StringBuilder(s1);
           t= t + stringBuilder.reverse()+ " ";
        }
        System.out.println(t);
    }
}
