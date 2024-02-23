public class OccuranceOfParticularCharacter {
    public static void main(String[] args) {
        String s="hello java";
        int totalcount = s.length();
        int a_repeating  = s.replace("a","").length();
        int occrance = totalcount-a_repeating;
        System.out.println(occrance);
    }
}
