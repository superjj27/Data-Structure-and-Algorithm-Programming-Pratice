package exercise.leedcode.stringQuestions;

import java.util.HashSet;

//Find duplicate characters from String
public class FindDuplicateFromString {

    //abcaedd
    public static HashSet<Character> findDuplicate(String input) throws Exception{

        HashSet<Character> checked = new HashSet<>();
        HashSet<Character> duplicated = new HashSet<>();
        if (input == null && input.length() <= 1) {
            System.out.println("Input is either null or length <= 1");
            throw (new Exception("Input is either null or length <= 1)"));
        }

        for (int i=0; i<input.length(); i++) {
            char character = input.charAt(i);
            if (checked.contains(character)) {
                duplicated.add(character);
            } else {
                checked.add(character);
            }

        }
        return duplicated;
    }
    public static void main(final String[] args) {
        String input = "Programming";
        try {
            HashSet<Character> output = findDuplicate(input);
            output.forEach(System.out::print);
        } catch(Exception ex) {
            ex.getMessage();
        }
    }


}
