package exercise.leedcode.stringQuestions;

public class FindPalindromicSubstring {

    public static String FindPalindromicSubstring(String s) {

        //babad
        String result = "";

        for (int i=0; i<s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int j = i;
            for (; j<s.length(); j++) {
                Character character = s.charAt(j);
                sb.append(character);
                if (CheckPalindrome(sb.toString())) {
                    if (sb.toString().length() > result.length()) {
                        result = sb.toString();
                    }
                }
            }
        }
        return result;
    }

    private static String reverseRecursively(String input) {
        if(input.length() < 2) {
            return input;
        }
        return reverseRecursively(input.substring(1)) + input.charAt(0);
    }

    private static boolean CheckPalindrome(String str) {
        if (str.length() <= 1) {
            return false;
        }
        String reverse = reverseRecursively(str);

        if(str.equals(reverse)) {
            return true;
        }
        return false;
    }


    public static void main(final String[] args) {

        String s = "babcddcdasdajavvaja";
        System.out.println(FindPalindromicSubstring(s));
    }
}
