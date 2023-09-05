package exercise.codility.SieveOfEratosthenes;


import java.util.Arrays;

//Calculate the number of elements of an array that are not divisors of each element.
public class CountNonDivisible {

    private static int[] CountNonDivisible(int[] A) {

        //3,1,2,3,6

        int[] res = new int[A.length];
        for (int i=0; i<A.length; i++) {
            int element = A[i];
            int j = 0;
            int cnt = 0;
            for (; j<A.length; j++) {
                if( i == j) {
                    continue;
                } else {
                    if (element % A[j] != 0) {
                        res[i] = ++cnt;
                    }
                }
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        System.out.println(Arrays.toString(CountNonDivisible(new int[] {3,1,2,3,6})));
    }

}
