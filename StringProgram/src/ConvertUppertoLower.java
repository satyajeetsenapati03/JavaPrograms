public class ConvertUppertoLower {
    public static void main(String[] args) {
        String s ="SATYAjeet";
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                 ch[i]=Character.toLowerCase(ch[i]);
            }else {
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
