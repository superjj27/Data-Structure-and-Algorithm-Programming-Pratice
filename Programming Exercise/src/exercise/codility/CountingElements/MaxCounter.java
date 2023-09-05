package exercise.codility.CountingElements;

import java.util.Arrays;

public class MaxCounter {

    private static int[] findMaxCounter(int N, int[] A) {


        //3, 4, 4, 6, 1, 4, 4
//        (0, 0, 1, 0, 0)
//        (0, 0, 1, 1, 0)
//        (0, 0, 1, 2, 0)
//        (2, 2, 2, 2, 2)
//        (3, 2, 2, 2, 2)
//        (3, 2, 2, 3, 2)
//        (3, 2, 2, 4, 2)
        int[] res = new int[N];
        int maxCounter = 0;
        for (int i=0; i<A.length; i++) {
            int element = A[i];
            if (element == N + 1) {
                for(int j= 0 ; j < res.length; j++) {
                    res[j] = Math.max(res[j], maxCounter);
                }
            } else {
                int counter = res[element - 1];
                if (element <= N && element >= 1) {
                    counter++;
                    res[element - 1] = counter;
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] B = {3, 4, 4, 6, 1, 4, 4, 6};
        int[] C = {2, 1, 1, 2, 1};
        System.out.println(Arrays.toString(findMaxCounter(5, A)));
        System.out.println(Arrays.toString(findMaxCounter(5, B)));
        System.out.println(Arrays.toString(findMaxCounter(1, C)));

    }


}
