package exercise.leedcode.stringQuestions;

//Count the occurrence of all alphabets in String


import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAllAlphabetsInStrin {


    public void countOccurrenceOfAllAlphabetsInString(String input) {
        // Today is Monday
        char[] charArray = input.toLowerCase().toCharArray();

        Map<Character, Integer> output = new HashMap<>();
        for (Character character : charArray) {
            if (output.containsKey(character)) {
                int cnt = output.get(character) + 1;
                output.put(character, cnt);
            } else {
                output.put(character, 1);
            }
        }

        output.forEach(
                (key, value) -> System.out.println(key + " = " + value)
        );
    }
    public static void main(final String[] args) {
        final String str = "Today is Monday";
        CountOccurrenceOfAllAlphabetsInStrin test = new CountOccurrenceOfAllAlphabetsInStrin();
        test.countOccurrenceOfAllAlphabetsInString(str);
    }
}
