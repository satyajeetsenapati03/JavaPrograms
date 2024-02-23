public class PrintSeparateCharNumSpecialChar {
    public static void main(String[] args) {
        String s="satyajeet@123.com ";
        String temp1="";
        String temp2="";
        String temp3="";
        s=s.trim();
        for (int i=0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ){
                temp1=temp1+s.charAt(i);
            } else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                temp2=temp2+s.charAt(i);

            }else {
                temp3=temp3+s.charAt(i);
            }
        }
        String res=temp1+temp2+temp3;
        System.out.println(res);
    }
}
