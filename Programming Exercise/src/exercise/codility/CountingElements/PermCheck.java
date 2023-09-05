package exercise.codility.CountingElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static int solution(int[] A) {
        //4,1,3
        Arrays.sort(A);

        int max = A[A.length - 1];
        if (max > A.length) {
            return 0;
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i< A.length; i++){
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(final String[] args) {
        System.out.println(solution(new int[] {4,1,3,2}));
        System.out.println(solution(new int[] {4,1,3}));
        System.out.println(solution(new int[] {1,1,2}));
        System.out.println(solution(new int[] {1,1,1}));
    }

}
