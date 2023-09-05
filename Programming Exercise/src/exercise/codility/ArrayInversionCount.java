package exercise.codility;

import java.util.HashSet;

public class ArrayInversionCount {

    public static int countArrayInversion(int[] A) {

        int cnt = 0;
        HashSet<Integer> visited = new HashSet<>();
        // -1, 6, 3, 4, 7, 4
        // (1,2)  (1,3)  (1,5)  (4,5)
        for (int i=0; i<A.length; i++) {
            for (int j=1; j<A.length; j++) {
                if(checkIsInversion(i, j, A)) {
                    Integer check = i+j;
                    if (!visited.contains(check)) {
                        visited.add(check);
                        System.out.println(i + "," + j + " {" + A[i] + "," + A[j] + "}");
                        cnt++;
                    }
                }
            }
        }
        return cnt;

    }

    public static boolean checkIsInversion(int i, int j, int[] array) {

        if( (i < j && array[i] > array [j]) || i > j && array[i] < array[j]) {
            return true;
        }
        return false;
    }

    public static void main(final String[] args) {

        int[] array = {-1, 6, 3, 4, 7, 4};
        System.out.println(countArrayInversion(array));
    }

}
