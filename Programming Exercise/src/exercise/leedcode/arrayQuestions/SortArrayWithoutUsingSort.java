package exercise.leedcode.arrayQuestions;

import java.util.Arrays;

public class SortArrayWithoutUsingSort {

    public static int[] sortArray(int[] array) {

        //6,2,5,1
        int temp;
        for (int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(final String[] args) {

        int[] array = {3, 4, 5, 1, 2};
        System.out.println(Arrays.toString(sortArray(array)));
    }

}
