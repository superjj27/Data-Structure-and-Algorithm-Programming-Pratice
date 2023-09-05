package exercise.codility.MaxSliceProblem;

import java.util.Arrays;
public class MaxSliceSum {


    public static int solution(int[] A) {
        //3,2,-6,4,0 = 3
        //-6,0,2,3,4

        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }


        int totalSum = 0;
        int localMax = A[0];
        int absMax = A[0];
        for (int i=1; i<A.length; i++) {
            totalSum = localMax + A[i];
            localMax = Math.max(totalSum, A[i]);
            absMax =  Math.max(localMax, absMax);
        }
        return absMax;
    }

    public static void main(final String[] args) {

        //System.out.println(solution(new int[] {3,2,-6,4,0}));
        //System.out.println(solution(new int[] {-10}));
        System.out.println(solution(new int[] {-2, -2}));
        //System.out.println(solution(new int[] {-1,1}));
        //System.out.println(solution(new int[] {-1,0,1}));
        //System.out.println(solution(new int[] {-1,-1,1}));
    }
}
