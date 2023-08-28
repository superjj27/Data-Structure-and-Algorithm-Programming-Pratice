package exercise.leedcode.stringQuestions;

// find repeated substring pattern
public class FindRepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String string){

        if (string.length() < 2) {
            return false;
        }
        //abab
        StringBuilder substr = new StringBuilder();
        for(int i=0; i<string.length()/2; i++) {
            substr.append(string.charAt(i));

            String check = string.replaceAll(substr.toString(), "");

            if(check.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(final String[] args) {

        String s = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }




}
