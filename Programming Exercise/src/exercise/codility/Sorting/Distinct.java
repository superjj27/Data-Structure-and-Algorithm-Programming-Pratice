package exercise.codility.Sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    private static int findDistinct(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i=0; i<A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
    public static void main(final String[] args) {
        System.out.println(findDistinct(new int[] {2,1,1,2,3,1}));
    }

}
