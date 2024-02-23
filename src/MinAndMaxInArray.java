import java.util.Arrays;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] a = {80, 20, 60, 10, 5, 100};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum value :"+max);
        int[] b= Arrays.copyOf(a,a.length); // initialize a[] to b[]
        int min =b[0];
        for(int i=0;i<b.length;i++){
            if(min>b[i]){
                min=b[i];
            }
        }
        System.out.println("Minimum Value :"+min);
    }
}