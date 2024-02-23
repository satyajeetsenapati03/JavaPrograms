import java.util.HashMap;
import java.util.Map;

public class B {
    public static void main(String[] args) {
        String s = "hello world";
        String[] rev = s.split(" ");
      for(int i=rev.length-1;i>=0;i--){
          System.out.print(rev[i]+" ");
      }
    }
}
