package exercise.leedcode.stringQuestions;

//Reverse a given String using recursion
public class ReverseString {

    public static String reverseString(String input) throws Exception {

        if (input == null || input.length() <= 1) {
            throw new Exception("Invalid input!");
        }

        //method 1
        StringBuilder builder = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i=input.length()-1; i>=0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();

    }

    public static String reverseRecursively(String input) {
       if(input.length() < 2) {
            return input;
       }
       //ava, va, a
        //avaj, vaj

       return reverseRecursively(input.substring(1)) + input.charAt(0);
    }
    //avaJ, vaJa
    public static void main(final String[] args) {
        String[] input = {"Java","abcdefghija", "hello", "simplest", "aaa"};
        try {
            for(String str : input) {
                System.out.println(reverseRecursively(str));
            }
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
