package exercise.codility.TimeComplexity;

//Count minimal number of jumps from position X to Y.
public class FrogJump {

    private static int calculateJump(int X, int Y, int D) {

        int distance = X;
        int cnt = 0;

//
//        return calRecursively(X, Y, D, distance, cnt);
//
        for (;;) {
            distance = distance + D;
            cnt++;
            if (distance >= Y) {
                break;
            }
        }
        return cnt;
    }

    public static int calRecursively(int x, int y, int D, int distance, int cnt) {
        if(distance >= y) {
            return cnt;
        }
        distance = distance + D;
        cnt++;
        return calRecursively(x, y, D, distance, cnt);
    }
    public static void main(final String[] args) {

        //System.out.println(calculateJump(10, 85, 30));
        System.out.println(calculateJump(1, 1, 3));
    }
}
