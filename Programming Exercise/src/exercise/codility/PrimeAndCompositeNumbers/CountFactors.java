package exercise.codility.PrimeAndCompositeNumbers;

public class CountFactors {

    public static int solution(int N) {

//        int cnt = 1;
//        for (int i=1; i<=N/2; i++) {
//            if(N%i == 0) {
//                cnt++;
//            }
//        }
//        return cnt;

        int sqrtN = (int) Math.sqrt(N);
        int numFactor =0; // number of factors

        // check if i is a factor or not (by using N % i ==0)
        for(int i=1; i <= sqrtN; i++){
            if(N % i ==0){
                numFactor++;
            }
        }

        numFactor = numFactor * 2; // add its pair

        // be careful: check if "sqrtN * sqrtN == N"
        if( sqrtN * sqrtN == N){
            numFactor = numFactor -1; // minus one: avoid double counting
        }

        return numFactor;
    }

    public static void main(final String[] args) {
        System.out.println(solution(16));
        //System.out.println(solution(1));
        //System.out.println(solution(3));
        //System.out.println(solution(2147483647));
        //2,147,483,647
    }
}
