package exercise.codility.Sorting;

public class NumberOfDiscIntersections {

    public static int solution(int[] A) {

        //1,5,2,1,4,0
        //0,1,1,2,4,5
        //,


        int sum = 0;
        //int len = A.length;
        int[] startArr = new int[A.length];
        int[] endArr = new int[A.length];
        int active = 0;

        // fill arrays with zeros
        for (int i = 0; i < A.length; i++) {
            startArr[i] = 0;
            endArr[i] = 0;
        }

        // sort start and end boundaries of the discs into their own arrays
        for (int i = 0; i < A.length; i++) {

            if (i < A[i]) {
                startArr[0]++;
            } else {
                startArr[i - A[i]]++;
            }

            if (i + A[i] >= A.length) {
                endArr[A.length - 1]++;
            }  else {
                endArr[i + A[i]]++;
            }
        }

        // <--- here is where I lose it, this for loop, I just simply do not understand why this works or how anyone could of gotten this
        for (int i = 0; i < A.length; i += 1) {
            sum += active * startArr[i] + (startArr[i] * (startArr[i] - 1)) / 2;
            // over 10 000 000 return -1 as stated in the assignment
            if (10000000 < sum)
                return -1;

            active += startArr[i] - endArr[i];
        }
        // return the answer
        return sum;
    }

    public static void main(final String[] args) {
        //int[] A = {-3, 1, 2, -2, 5, 6};
        //int[] A = {-1, 2, 0};
        int[] A = {1,5,2,1,4,0};
        System.out.println(solution(A));
    }

}
