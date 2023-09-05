package exercise.codility.Array;

public class CyclicRotation {


    public static int[] rotate(int[] A, int n) {


        //3, 8, 9, 7, 6
        //6, 3, 8, 9, 7
        //7, 6, 3, 8, 9
        //9, 7, 6, 3, 8
        //int[] temp = {3, 8, 9, 7, 6};


        for (int i=0; i<n; i++) {
            int last = A[A.length - 1];
            for (int j=A.length-1; j>0; j--) {
               A[j] = A[j-1];
            }
            A[0] = last;
        }

        return A;
    }

    public static void main(final String[] args) {
        int[] x = {3, 8, 9, 7, 6};
        System.out.println(rotate(x, 3));
    }
}
