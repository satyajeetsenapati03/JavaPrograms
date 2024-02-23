import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] a ={10,40,80,20,30,100,90,5};
        int temp=0;
       int min;
        for (int i=0;i<a.length;i++){
           min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;

        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }

    }
}
