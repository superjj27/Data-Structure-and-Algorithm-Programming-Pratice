package exercise.codility;

import java.util.HashSet;

public class CountArrayBoundedSlices {

    public static int CountArrayBoundedSlices(int k, int[] array) {

        //3, 5, 7, 6, 3
        HashSet<Integer> visited = new HashSet<>();
        int cnt = 0;
        for (int i=0; i<array.length; i++) {
            int iElement = array[i];
            int j = 0;
            for(; j<array.length; j++) {
                if (i > j) {
                    continue;
                }

                int jElement = array[j];
                int check =  iElement >= jElement ? iElement - jElement : jElement - iElement;
                if (check <= k) {
                    System.out.println(i + "," +j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(final String[] args) {

        int[] array = {3, 5, 7, 6, 3};
        System.out.println(CountArrayBoundedSlices(2, array));
    }

}
