package exercise.leedcode.stringQuestions;

import java.util.*;

//Check if two Strings are anagrams of each other

public class CheckAnagrams {

    public static boolean checkAnagrams(String string1, String string2) throws Exception {

        if(string1.length() == 0 || string2.length() == 0) {
            throw new Exception("invalid input!");
        }

        Map<Character, Integer> map1 = convertStringIntoMap(string1);
        Map<Character, Integer> map2 = convertStringIntoMap(string2);

        if (map1.equals(map2)) {
            return true;
        } else {
            return false;
        }
    }

    public static Map<Character, Integer> convertStringIntoMap(String input) {

        input = input.toLowerCase();
        Map<Character, Integer> result = new HashMap<>();

        for (int i=0; i<input.length(); i++) {
            Character character = input.charAt(i);
            if (!result.containsKey(character)) {
                result.put(character, 1);
            } else {
                result.put(character, result.get(character) + 1);
            }
        }
        return result;
    }

    public static void main(final String[] args) {
        String[] inputs1 = {"angel", "bored", "dusty", "javaa"};
        String[] inputs2 = {"glean", "robed", "study", "java"};

        for (int i=0; i<inputs1.length; i++) {
            String str1 = inputs1[i];
            String str2 = inputs2[i];
            try {
                System.out.println(checkAnagrams(str1, str2));
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
