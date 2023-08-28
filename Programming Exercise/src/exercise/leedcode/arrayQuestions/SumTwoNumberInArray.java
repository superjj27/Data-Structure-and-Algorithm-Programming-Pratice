package exercise.leedcode.arrayQuestions;

import java.util.HashSet;

public class SumTwoNumberInArray {

    public static int[] sumTwoNumberInArray(int [] array, int n) {
        //2,11,7,5 n=9
        int [] result = new int[2];
        for (int i=0; i<array.length; i++) {
            for (int j=1; j<array.length; j++) {
                if (array[i] + array[j] == n) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(final String[] args) {

        int[] array = {2, 11, 7, 5};
        int n = 9;
        System.out.println(sumTwoNumberInArray(array, n));
    }


}
