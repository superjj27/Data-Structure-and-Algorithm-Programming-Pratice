package exercise.codility.PrimeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Flag {

    public static int solution(int[] A) {

        List<Integer> list = new ArrayList<>();
        //1,5,3,4,3,4,1,2,3,4,6,2
        for (int i=0; i<A.length-2; i++) {
            int previous = A[i];
            int curr = A[i+1];
            int next = A[i+2];
            if (curr > previous && curr > next) {
                list.add(i+1);
            }

        }

        if(list.size() == 0) {
            return 0;
        }
        if(list.size() == 1) {
            return 1;
        }
        int[] peaks = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        //1,3,5,10
        int maxFlag = peaks.length;
        int res = 0;

        //1,3,5,10
        int maxFlagCnt = 0;
        for (int i=1; i<=maxFlag; i++) {
            int count = 1;
            int previous = peaks[0];
            for (int j=1; j<peaks.length && count < i; j++) {
                int curr = peaks[j];
                if (Math.abs(previous - curr) >= i) {
                    count++;
                }
            }
            maxFlagCnt = Math.max(maxFlagCnt, count);
        }


        return maxFlagCnt;
    }

    public static void main(final String[] args) {
        System.out.println(solution(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));

    }
}
