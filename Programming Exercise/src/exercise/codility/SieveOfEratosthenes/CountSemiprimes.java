package exercise.codility.SieveOfEratosthenes;

import java.util.*;
import java.util.stream.Collectors;

public class CountSemiprimes {

    public static int[] solution(int N, int[] P, int[] Q) {
        int [] result = new int[P.length];
        List<Integer> list = new ArrayList<>();
        //
        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        List<Integer> primes = list.stream()
                .filter(num -> num> 1 && checkIsPrime(num))
                .collect(Collectors.toList());

        //2,3,5,7,11,13

        for (int i=0; i<P.length; i++) {
            int min = P[i];
            int max = Q[i];
            List<Integer> res = countSemiPrime(min, max,primes);
            result[i] = res.size();
        }
        return result;
    }

    private static List<Integer> countSemiPrime(int min, int max, List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<list.size(); i++) {
            int curr = list.get(i);
            for(int j=i; j<list.size(); j++) {
                int val = curr * list.get(j);
                if ((val >= min && val <= max) && !set.contains(val)) {
                    set.add(val);
                    res.add(val);
                }
            }
        }
        return res;

    }

    private static boolean checkIsPrime(int num) {


        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < num; i=i+2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(final String[] args) {
        //System.out.println(solution(30));
        //System.out.println(Arrays.toString(solution(1, new int[]{1,4,16}, new int[]{26,10,20})));
        System.out.println(Arrays.toString(solution(1, new int[]{1}, new int[]{1})));
    }

}
