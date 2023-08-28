package exercise.codility;

import java.util.ArrayList;
import java.util.List;

public class FindEquilibriumIndex {

    private static List<Integer> findEquilibriumIndex(int[] array) {


        List<Integer> result = new ArrayList<>();
        int totalSum = 0;
        for (int element : array) {
            totalSum = totalSum + element;
        }

        int currSum = 0;
        for (int i=0; i<array.length; i++) {
           if (totalSum - currSum - array[i] == currSum) {
                result.add(i);
            }
            currSum = currSum + array[i];
        }
        return result;
    }

    public static void main(final String[] args) {
        // -1 + 3 + -1 = 1
        // left + cur + right = sum
        // cur = sum - left - right
        //-2 + 5 -2 = 1
        int[] array = {-1, 3, -4, 5, 1, -6, 2, 1}; //1
        System.out.println(findEquilibriumIndex(array));
    }






}
