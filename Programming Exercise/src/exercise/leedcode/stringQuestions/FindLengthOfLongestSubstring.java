package exercise.leedcode.stringQuestions;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

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
               //System.out.println(output);
               output = input.substring(i, j);
           }
        }
        return output.length();
    }

    private static int lengthOfLongestSubstringMethod2(String input) {

        Set<String> res = new HashSet();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder sb = new StringBuilder();
            HashSet<Character> checked = new HashSet<>();
            sb.append(input.charAt(i));
            checked.add(input.charAt(i));
            for (int j = i+1; j < input.length(); j++) {
                Character character = input.charAt(j);
                if (!checked.contains(character)) {
                    checked.add(character);
                    sb.append(character);
                    res.add(sb.toString());
                } else {
                    break;
                }
            }
        }

        return res.stream()
                .max(Comparator.comparingInt(String::length))
                .get()
                .length();
    }

    public static void main(final String[] args) {
        String s = "pwwkew";
        //String s = "abrcadabar";
        //String s = "aabcegffbtrdsacvadefc";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringMethod2(s));
    }


}
