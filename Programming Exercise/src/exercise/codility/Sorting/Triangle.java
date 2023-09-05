package exercise.codility.Sorting;

import java.util.Arrays;

public class Triangle {

    public static int solution(int[] A) {
        // P, Q, R
        //10, 2, 5, 1, 8, 20
        //1, 2, 5, 8, 10, 20
        Arrays.sort(A);
        if (A.length < 3) {
            return 0;
        }
        for (int i=0; i<A.length-2 ;i++) {
            if (A[i]>A[i+2]-A[i+1]){
                return 1;
            }
        }
        return 0;
    }

    public static void main(final String[] args) {
        //int[] A = {-3, 1, 2, -2, 5, 6};
        //int[] A = {-1, 2, 0};
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(solution(A));
    }

}
