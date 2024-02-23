import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="SSSS";
       String result="";
       for (int i=0;i<s.length();i++){
           String  ch = ""+s.charAt(i);
           if(result.contains(ch)){
               continue;
           }
           else {
               result=result+ch;
           }
       }
        System.out.println(result);
    }
}
