package exercise.codility.Leader;

import java.util.*;
import java.util.stream.Collectors;

public class Dominator {

    public static int findDominator(int[] A) {

        //3, 4, 3, 2, 3, -1, 3, 3
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            int cnt = map.get(A[i]);
            if (cnt > A.length / 2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(final String[] args) {
        int[] A = {3, 3, 3, 4, 4, 4, 4};
        System.out.println(findDominator(A));
    }

}
