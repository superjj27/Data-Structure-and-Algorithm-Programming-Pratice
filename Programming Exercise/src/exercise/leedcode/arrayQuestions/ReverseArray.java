package exercise.leedcode.arrayQuestions;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] A) {

        //3, 8, 9, 7, 6
        //6, 7, 8, 9, 3
        int[] result = new int[A.length];
        int j = 0;
        for (int i=A.length-1; i>=0; i--) {
           result[j] = A[i];
           j++;
        }
        return result;
    }

    public static void main(final String[] args) {
        int a = 12345 % 10;
        System.out.println(a);
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(reverseArray(array));
    }

}
