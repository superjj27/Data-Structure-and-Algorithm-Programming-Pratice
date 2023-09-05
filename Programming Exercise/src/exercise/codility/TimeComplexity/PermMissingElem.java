package exercise.codility.TimeComplexity;

import java.util.HashSet;
import java.util.Set;

// Find the missing element in a given permutation.
public class PermMissingElem {

    public static int FindMissingElem(int[] A) {
        // 2, 1, 3, 5
        // 1, 2, 3, 5

        Set<Integer> set = new HashSet<>();

        // add elements into the set
        for(int i=0; i< A.length; i++){
            set.add(A[i]);
        }

        for(int i=1; i<= A.length; i++){
            if(!set.contains(i)) // the 1st missing element
                return i;
        }

        return A.length+1;


//        Arrays.sort(A);
//        List<Integer> sortedList = Arrays.stream(A)
//                .boxed()
//                .collect(Collectors.toList());
//        int min = A[0];
//        int max = A[A.length - 1];
//        for (int i=min; i<max; i++) {
//            if (!sortedList.contains(i)) {
//                return i;
//            }
//        }
//        return -1;
    }

    public static void main(final String[] args) {

        int[] A = {2, 3, 1, 5};
        System.out.println(FindMissingElem(A));
    }

}
