package Unit3;

public class isVowel {
    public static void main(String[] args) {
        System.out.println(isVowel("a"));
    }
    public static boolean isVowel(String vowel){
//        if (vowel.equals("a") || vowel.equals("e") || vowel.equals("i") || vowel.equals("o") || vowel.equals("u")){
//            return true;
//        } else {
//            return false;
//        }
        return vowel.equals("a") || vowel.equals("e") || vowel.equals("i") || vowel.equals("o") || vowel.equals("u");
    }
}
