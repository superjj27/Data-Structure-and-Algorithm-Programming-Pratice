package exercise.codility.Array;

import java.util.*;
import java.util.stream.Collectors;

public class FindOddOccurrence {

    public static int findOddOccurrence(int[] A) {

        int[] res = Arrays.stream(A)
                .filter(e -> Collections.frequency(Arrays.stream(A).boxed().collect(Collectors.toList()), e) % 2 != 0)
                .toArray();

        return res.length == 0 ? -1 : res[0];
    }

//        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
//        list.stream().filter(e -> Collections.frequency(list, e) % 2 != 0)
//                .collect(Collectors.toList());
//
//        for (int i=0; i<A.length; i++) {
//            int count = Collections.frequency(list, A[i]);
//            if (count % 2 != 0) {
//                return A[i];
//            }
//        }
//
//        return -1;


    public static void main(final String[] args) {

        int[] array = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(findOddOccurrence(array));
    }


}

