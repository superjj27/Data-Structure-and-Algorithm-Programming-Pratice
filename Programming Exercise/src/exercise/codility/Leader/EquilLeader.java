package exercise.codility.Leader;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EquilLeader {

    public static int solution(int[] A) {
        //4, 3, 4, 4, 4, 2
        if (A == null || A.length <= 1) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        Integer maxValueInMap = (Collections.max(map.values()));
        Integer maxKey =  map.entrySet().stream()
                .filter(entry -> maxValueInMap.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);

        if (maxKey == null) {
            return 0;
        }

        int res = 0;
        int leaderCnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxKey) {
                leaderCnt += 1;
            }
            int preLeaderNum =  (i + 1) / 2;
            int postLeaderNum = (A.length - 1 - i) / 2;
            if (leaderCnt > preLeaderNum && (maxValueInMap - leaderCnt) > postLeaderNum) {
                res++;
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        //int[] A = {4, 3, 4, 4, 4, 2};
        int[] A = {0,0};
        System.out.println(solution(A));
    }


}
