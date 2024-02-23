import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 4, 5, 5, 5};
        int[] b = {10, 31, 16, 76, 10, 21, 31, 76, 108, 108};

        HashSet<Integer> hs = new HashSet<Integer>();
        //sorted array
        for(int i = 0; i < a.length; i++) {
               hs.add(a[i]);
        }
        for(int no : hs){
            System.out.print(no+" ");
        }
        System.out.println("______________________________");
        //nonsorted array
        HashSet<Integer> hs1 = new HashSet<Integer>();
        for (int j=0;j<b.length;j++){
            hs1.add(b[j]);
        }

        for (int no1 : hs1){
            System.out.print(no1+" ");
        }


    }
}