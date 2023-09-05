package exercise.codility;

public class FindTheHighestPowerOfTwoThatDividesN {

    public static int FindTheHighestPowerOfTwoThatDividesN(int N) {

        int base = 1;
        int max = 0;
        int cnt = 0;
        if(N == 1) {
            return 0;
        }

        if (N == 2) {
            return 1;
        }

        for(int i=1; i<N/2; i++) {
            base = base * 2;
            if (base > N) {
                return cnt;
            }
            if (N % base == 0 && base <= N) {
                if (base > max) {
                    max = base;
                    cnt++;
                }

            }
        }
        return cnt;
    }

    public static void main(final String[] args) {

        int n = 4;
        System.out.println(FindTheHighestPowerOfTwoThatDividesN(n));
    }

}
