package exercise.leedcode.stringQuestions;

import java.util.HashSet;

// Longest Substring Without Repeating Characters
public class FindLengthOfLongestSubstring {

    //pwwkew
    public static int lengthOfLongestSubstring(String input) {

        String output = "";
       for (int i = 0; i < input.length(); i++) {
           HashSet<Character> checked = new HashSet<>();
           int j = i;
           for (; j < input.length(); j++) {
               Character character = input.charAt(j);
               if (!checked.contains(character)) {
                   checked.add(character);
               } else {
                   break;
               }
           }

           if (output.length() < j - i + 1) {
               System.out.println(output);
               output = input.substring(i, j);
           }
       }
       return output.length();
    }
    public static void main(final String[] args) {

        String s = "abrcadabar";
        System.out.println(lengthOfLongestSubstring(s));
    }


}
