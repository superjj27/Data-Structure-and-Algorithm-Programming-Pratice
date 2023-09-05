package exercise.codility.Iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {

    public static int solution(int N) {
        String binaryNum = Integer.toBinaryString(N);
        char[] A  = binaryNum.toCharArray();
        //10000010001
        //100000
        //10100
        int cnt = 0;
        int res = 0;
        for (int i=1; i<A.length; i++) {
            char curr = A[i];
            if (curr == '0') {
                cnt ++;
            } else {
                res = Math.max(res, cnt);
                cnt = 0;
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        System.out.println(solution(5)); //1
        System.out.println(solution(32)); //100000
        System.out.println(solution(20)); //10100
        System.out.println(solution(1)); //0
        System.out.println(solution(1041)); //10000010001
        System.out.println(solution(2147483647));
    }
}
