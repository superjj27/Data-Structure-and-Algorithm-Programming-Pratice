package exercise.codility.CountingElements;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4, 6 })));
        System.out.println(Arrays.toString(solution(1, new int[] { 2, 1, 1, 2, 1 })));
    }

    // Time: O(M + N)
    // Space: O(N)
    // 100/100
    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int lastMax = 0;
        int[] counters = new int[N];

        for (int k = 0; k < A.length; k++) {
            if (A[k] >= 1 && A[k] <= N) {
                // this is instead of the nested loop in solution2
                counters[A[k] - 1] = Math.max(counters[A[k] - 1], lastMax);
                counters[A[k] - 1] += 1;
                max = Math.max(max, counters[A[k] - 1]);
            } else if (A[k] == N + 1) {
                lastMax = max;
            }
        }

        for(int i = 0 ; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastMax);
        }

        return counters;
    }
}
