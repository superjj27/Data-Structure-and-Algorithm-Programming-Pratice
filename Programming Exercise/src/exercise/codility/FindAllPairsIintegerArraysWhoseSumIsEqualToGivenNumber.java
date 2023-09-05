package exercise.codility;

import java.util.*;

//Find all pairs of integer arrays whose sum is equal to a given number?
public class FindAllPairsIintegerArraysWhoseSumIsEqualToGivenNumber {
    //{ 2, 4, 3, 5, 7, 8, 9 };

    public static List<List<Integer>> findNumbersSumEqualToGivenNumber(int[] array, int sum) {
        //{2, 2, 4, 3, 5, 7, 8, 9}
        //int [] result = new int[2];
        boolean check[] = new boolean [array.length];
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> subResult = new ArrayList<>();
        for (int i=0; i<array.length; i++) {
            for (int j=1; j<array.length; j++) {
                if (array[i] + array[j] == sum) {
                    if (check[i] == false || check[j] == false) {
                        subResult.add(i);
                        subResult.add(j);
                        check[i] = true;
                        check[j] = true;
                        System.out.println(i + "," + j);
                        result.add(subResult);
                    }
                }
            }
        }
        return result;



//
//        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
//        //HashSet<Integer> set = new HashSet<>(Arrays.asList(array));
////        HashSet<Integer> sortedHashSet = set.stream()
////                .sorted()
////                .collect(Collectors.toCollection(LinkedHashSet::new));
//
//        List<Integer> list = Arrays.stream(array)
//                .boxed()
//                .collect(Collectors.toList());
//
//        Set<Integer> visited = new HashSet<>();
//
//        List<List<Integer>> result = new ArrayList<>();
//        for (Integer element : set) {
//            if(set.contains(sum - element)) {
//                List<Integer> subResult = new ArrayList<>();
//                int a = element;
//                int b = sum - element;
//                int indexA = list.indexOf(a);
//                int indexB = list.indexOf(b);
//                subResult.add(indexA);
//                subResult.add(indexB);
//                result.add(subResult);
//                System.out.println(indexA + "," + indexB);
//            }
//        }
//        return result;
    }

    public static void main(final String[] args) {
        int[] input = {2, 4, 3, 5, 7, 8, 9};

        System.out.println(findNumbersSumEqualToGivenNumber(input, 7));
    }

}



