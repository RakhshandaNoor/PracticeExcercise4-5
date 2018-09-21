public class TotalOccurenceOfChar {

    int count(String str,String c){
       return str.length()- str.replaceAll(c,"").length();

    }

    public static void main(String[] args) {
        TotalOccurenceOfChar t= new TotalOccurenceOfChar();
       int x= t.count(new String("ccedc"),"e");
        System.out.println(x);
    }
}
