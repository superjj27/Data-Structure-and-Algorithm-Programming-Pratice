package exercise.leedcode.arrayQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FindOddOccurrence {

    public static int findOddOccurrence(int[] A) {

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int i=0; i<A.length; i++) {
            int count = Collections.frequency(list, A[i]);
            if (count % 2 != 0) {
                return A[i];
            }
        }

        return -1;
    }

    public static void main(final String[] args) {

        int[] array = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(findOddOccurrence(array));
    }


}

