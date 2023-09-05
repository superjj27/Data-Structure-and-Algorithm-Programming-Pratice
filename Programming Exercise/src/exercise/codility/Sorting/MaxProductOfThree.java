package exercise.codility.Sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    private static int FindMaxProductOfThree(int[] A) {

        Arrays.sort(A);
        int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int max_2 = A[0] * A[1] * A[A.length-1];
        int max = Math.max(max_1, max_2);
        return max;
    }

    public static void main(final String[] args) {
        //int[] A = {-3, 1, 2, -2, 5, 6};
        //int[] A = {-1, 2, 0};
        int[] A = {-5, 5, -5, 4};
        System.out.println(FindMaxProductOfThree(A));
    }

}
