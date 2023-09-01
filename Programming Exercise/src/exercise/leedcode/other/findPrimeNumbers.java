package exercise.leedcode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findPrimeNumbers {

    private static List<Integer> findPrimeNumbers(int[] A) {

        return Arrays.stream(A).boxed().collect(Collectors.toList()).stream()
                .filter(num -> num % 2 != 0 && num != 1)
                .filter(findPrimeNumbers::checkIsPrime)
                .collect(Collectors.toList());
    }

    private static boolean checkIsPrime(int num) {

        for (int i = 3; i < num; i=i+2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(final String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,13,15};
        //int[] array = {-1, -3};
        List<Integer> res = findPrimeNumbers(array);
        res.forEach(System.out::println);
    }

}
