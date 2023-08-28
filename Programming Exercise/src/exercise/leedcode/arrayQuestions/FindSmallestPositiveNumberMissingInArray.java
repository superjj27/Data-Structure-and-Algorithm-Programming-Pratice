package exercise.leedcode.arrayQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSmallestPositiveNumberMissingInArray {

    public static int FindSmallestPositiveNumberMissingInArray(int[] A) {

        Arrays.sort(A);
        int result = 0;
        List<Integer> sortedList = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());
        int max = A[A.length - 1];
        int min = A[0];
        //1,1,2,3,4,6
        for (int i=min; i<=max; i++) {
            if (!sortedList.contains(i)) {
                result = i;
                break;
            }
        }
        if (result == 0) {
           return max + 1;
        }
        if (result <= 0) {
            return 1;
        }

        return result;

    }

    public static void main(final String[] args) {
        int[] array = {1,3,6,4,1,2};
        //int[] array = {-1, -3};
        System.out.println(FindSmallestPositiveNumberMissingInArray( array));
    }
}

