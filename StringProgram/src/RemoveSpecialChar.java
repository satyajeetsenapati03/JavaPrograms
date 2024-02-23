public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s="satyajeet@123";
        String s1="";
        for (int i=0;i<s.length();i++){
         s1= s.replaceAll("[^A-Za-z]","");

        }
        System.out.println(s1);
    }
}
