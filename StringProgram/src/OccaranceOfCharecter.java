import java.util.HashMap;
import java.util.Map;

public class OccaranceOfCharecter {
    public static void main(String[] args) {
        String s="hello";
        Map<Character,Integer> hm = new HashMap<>();
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(hm.containsKey(ch[i])){
               hm.put(ch[i],hm.get(ch[i])+1);
            }
            else {
                hm.put(ch[i],1);
            }
        }
        for(Map.Entry<Character,Integer> print : hm.entrySet()){
            System.out.println(print.getKey()+"    "+print.getValue());
        }
    }
}
