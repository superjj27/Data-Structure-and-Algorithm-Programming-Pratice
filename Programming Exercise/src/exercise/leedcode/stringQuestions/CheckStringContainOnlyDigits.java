package exercise.leedcode.stringQuestions;

import java.io.FileNotFoundException;
import java.io.IOException;


//Check if a String contains only digits
public class CheckStringContainOnlyDigits {


    public static boolean CheckStringContainOnlyDigits(String input) throws NumberFormatException {

        char[] characters = input.toCharArray();
        for(Character character : characters) {
            try {
                Integer.parseInt(character.toString());
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])  {

        String[] input = {"1234","1aw4", "a", "1"};
        try {
            for(String str : input) {
                System.out.println(CheckStringContainOnlyDigits(str));
            }
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}

