package exercise.codility.PrimeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinPerimeterRectangle {

    public static int solution(int N) {
        //[1, 2, 3, 5, 6, 10, 15, 30]
        List<Integer> divisors = findAllDivisors(N);
        if(divisors.size() == 0) {
            return 0;
        }

        int[] A = divisors.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(A);
        int min = 2147483647;
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A.length; j++) {
                if (A[i]*A[j] == N) {
                    int val = 2*(A[i] + A[j]);
                    min = Math.min(min, val);
                }
            }
        }

        return min;
    }

    public static List<Integer> findAllDivisors(int N) {
        List<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(N);
        for (int i=1; i<=sqrtN; i++) {
            if (N%i==0) {
                if (N/i == i) {
                    divisors.add(i);
                } else {
                    divisors.add(i);
                    divisors.add(N/i);
                }
            }
        }
        return divisors;
    }

    public static void main(final String[] args) {
        //System.out.println(solution(30));
        System.out.println(solution(30));
    }
}
