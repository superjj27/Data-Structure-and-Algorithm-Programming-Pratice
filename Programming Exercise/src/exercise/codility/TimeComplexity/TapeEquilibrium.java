package exercise.codility.TimeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {


    public static int findTapeEquilibrium(int[] A) {

        //3 ,1, 2, 4, 3
        int res = 1000;
        int left = 0;
        int sum = Arrays.stream(A).sum(); //13
        for (int i=0; i<A.length; i++) {
            left = left + A[i];
            int right = sum - left;
            int absVal = Math.abs(left - right);
            if (absVal < res) {
                res = absVal;
            }
        }
        return res;
    }

    public static void main(final String[] args) {

        int[] A = {3 ,1, 2, 4, 3};
        System.out.println(findTapeEquilibrium(A));
    }
}
