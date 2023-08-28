package exercise.leedcode.stringQuestions;

import java.util.*;

public class FindLongestCommonPrefix {


    public static String findLongestCommonPrefix(String[] strs) {

        Arrays.sort(strs, Comparator.comparing(s->s.length()));

        //"flower","flow","flight"]
        String result = "";
        String shortest = strs[0];
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<shortest.length(); i++) {
            Character character = shortest.charAt(i);
            String check = builder.append(character).toString();
            boolean found = false;
            for (int j=1; j<strs.length; j++) {
               String str = strs[j];
                if (!str.contains(check)) {
                    found = false;
                    break;
                } else {
                    found = true;
                }
            }
            if (found) {
                result = check;
            }
        }
        return result;
    }

    public static void main(final String[] args) {

        String[] strs = {"flower", "flow", "flowwer", "flowa"};
        System.out.println(findLongestCommonPrefix(strs));
    }

}
