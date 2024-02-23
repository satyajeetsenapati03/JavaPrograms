public class VowelsCount {
    public static void main(String[] args) {
        String s= "hEllo";
        char s1 ;
        int count=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            s1=s.charAt(i);
            if(s1=='a' || s1=='e' || s1=='i' || s1=='o' || s1=='u'){
                 count++;
                System.out.println(s1+" ");
            }
        }
        System.out.println(count);

    }
}
