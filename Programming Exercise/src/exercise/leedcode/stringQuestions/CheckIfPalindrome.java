package exercise.leedcode.stringQuestions;

public class CheckIfPalindrome {

    public static boolean CheckIfPalindrome(int x) {

        String original = String.valueOf(x);
        String reverse = reverseRecursively(original);

        if(original.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String reverseRecursively(String input) {
        if(input.length() < 2) {
            return input;
        }
        return reverseRecursively(input.substring(1)) + input.charAt(0);
    }

    public static void main(final String[] args) {

        int x = 101;
        System.out.println(CheckIfPalindrome(x));
    }
}
