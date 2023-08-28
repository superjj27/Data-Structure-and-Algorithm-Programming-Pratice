package exercise.leedcode.stringQuestions;


import java.util.HashMap;
import java.util.Map;

//Find the first non-repeated character from String
public class FindFirstNonRepeatedCharFromString {

    public static Character findFirstNonRepeatedCharFromString(String input) throws Exception {

        if (input == null || input.length() <= 1) {
            throw new Exception("Invalid input!");
        }

        input = input.toLowerCase();
        Map<Character, Integer> map = new HashMap();
       
        
        char[] charArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(charArray[i])) {
                map.put(charArray[i],  1);
            } else {
                map.put(charArray[i], map.get(charArray[i]) + 1);
            }
        }
        for(Character character : charArray) {
             if(map.get(character) == 1){
                 return character;
             }
        }
        
        return null;
    }

    public static void main(final String[] args) {
        String[] input = {"abcdefghija", "hello", "Java", "simplest", "aaa"};
        try {
            for(String str : input) {
                System.out.println(findFirstNonRepeatedCharFromString(str));
            }
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }


}
