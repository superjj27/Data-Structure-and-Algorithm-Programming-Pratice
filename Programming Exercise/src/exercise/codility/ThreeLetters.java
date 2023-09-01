package exercise.codility;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Given two integers A and B, return a string which contains A letters "a" and B letters "b" with no three consecutive letters being the same.
public class ThreeLetters {

    private static final String THREE_A = "aaa";
    private static final String THREE_B = "bbb";
    public static List<String> findStringWithoutConsecutiveLetter(int numA, int numB) {

        String a = "a";
        String b = "b";

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numA; i++) {
            sb.append(a);
        }
        for (int i=0; i<numB; i++) {
            sb.append(b);
        }
        HashSet<String> set = new HashSet<>();
        List<String> res = new ArrayList<>();
        permutation("", sb.toString(), set);
        for (String s : set) {
            if (!s.contains(THREE_A) && !s.contains(THREE_B)) {
                    res.add(s);
            }
        }
        return res;
    }

    private static void permutation(String perm, String word, HashSet<String> set) {
        if (word.isEmpty()) {
            if (!set.contains(perm)) {
                set.add(perm);
                //System.out.println(perm);
            }

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1), set);
            }
        }
    }

    public static void main(final String[] args) {

        int numA = 3;
        int numB = 3;

        //baabba babaab babbaa bababa abbaba aabbab bbabaa bbaaba aababb abbaab abaabb ababba ababab baabab
        List<String> res = findStringWithoutConsecutiveLetter(numA, numB);
        res.forEach(System.out::println);
    }

}
