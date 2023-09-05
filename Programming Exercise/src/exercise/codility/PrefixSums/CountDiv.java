package exercise.codility.PrefixSums;

//Compute number of integers divisible by k in range [a..b].
public class CountDiv {

    private static int CountDiv(int A, int B, int K) {

        //A=6, B=11, K=2
//        int min = A;
//        int max = B;
//        int cnt = 0;
//        for (int i=min; i<=max; i++) {
//            if (i%K == 0) {
//                cnt++;
//            }
//        }
//        return cnt;
        int bk = B/K;
        int ak = A/K;
        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);

    }

    public static void main(final String[] args) {
        System.out.println(CountDiv(6, 11, 1));
        System.out.println(CountDiv(6, 11, 2));
        System.out.println(CountDiv(6, 11, 3));
        System.out.println(CountDiv(6, 11, 4));
    }

}
