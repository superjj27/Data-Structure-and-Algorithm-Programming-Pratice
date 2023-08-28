package exercise.codility;

public class FindTheHighestPowerOfTwoThatDividesN {

    public static int FindTheHighestPowerOfTwoThatDividesN(int n) {

        int base = 1;
        int max = 0;
        for(int i=1; i<n/2; i++) {
            base = base * 2;
            if (base > n) {
                return max;
            }
            if (n % base == 0 && base <= n) {
                if (base > max) {
                    max = base;
                }

            }
        }
        return max;
    }

    public static void main(final String[] args) {

        int n = 24;
        System.out.println(FindTheHighestPowerOfTwoThatDividesN(n));
    }

}
