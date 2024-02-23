import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40,50,50,10,5,5,5,19};
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }

            }
        for (Map.Entry<Integer,Integer>  print : hm.entrySet()){
            if(print.getValue()>1){
                System.out.println(print.getKey());
            }
        }
    }
}
