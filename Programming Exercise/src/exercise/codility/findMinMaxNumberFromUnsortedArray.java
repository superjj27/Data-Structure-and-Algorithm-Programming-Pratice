package exercise.codility;

//find min and max in an unsorted array
public class findMinMaxNumberFromUnsortedArray {

    public static int findMinMaxNumberFromUnsortedArray(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i=1; i<array.length; i++) {
            int current = array[i];
            if (current < min) {
                min = array[i];
            }
            if (current > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(final String[] args) {
        int[] input = {9, 3, 6, 18, 2, 7};
        //int[] input = {1, 2, 3};

        System.out.println(findMinMaxNumberFromUnsortedArray(input));
    }
}
