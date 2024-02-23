public class ConvertAlternativeCharectertoUpperandLower {
    public static void main(String[] args) {
        String s = "sATYAJEet";

        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(i%2==0){
                ch[i]=Character.toLowerCase(ch[i]);
            }else{
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
