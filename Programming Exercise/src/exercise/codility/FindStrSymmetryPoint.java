package exercise.codility;

import java.util.Arrays;
import java.util.HashSet;

public class FindStrSymmetryPoint {


    public static int findStrSymmetryPoint(String s) {

        if(s.length()  == 1) {
            return 0;
        }
        //jaaadaaaj

        int index = s.length() / 2;
        String left = s.substring(0, index);
        String right = s.substring(index+1);
        right = reverseRecursively(right);
        if(left.equals(right)) {
            return index;
        } else {
            return -1;
        }


    }

    public static String reverseRecursively(String input) {
        if(input.length() < 2) {
            return input;
        }
        return reverseRecursively(input.substring(1)) + input.charAt(0);
    }

    public static void main(final String[] args) {

        String s = "jaaadaaaj";
        System.out.println(findStrSymmetryPoint(s));
    }



}
