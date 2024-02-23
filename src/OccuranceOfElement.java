import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElement {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40,50,50,10,5,5,5,19};
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){ // check elements are available or not
                hm.put(arr[i],hm.get(arr[i])+1); // put them into map and incremenet the count

            }
            else {
                hm.put(arr[i],1);
            }
        }
      for(Map.Entry<Integer,Integer> print : hm.entrySet()){ // entry is used for retrive the element
         System.out.println(print.getKey()+" Occrance  : "+print.getValue()); // provide occrance


      }
    }
}
