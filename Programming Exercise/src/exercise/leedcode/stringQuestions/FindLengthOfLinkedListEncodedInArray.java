package exercise.leedcode.stringQuestions;

public class FindLengthOfLinkedListEncodedInArray {

    public static int ComputeLenOfLinkedList(int[] array) {

        int length = 0;
        //1,4,-1,3,2
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                length++;
            }
        }
        return length;
    }
    public static void main(final String[] args) {

        int[] array = {1,4,-1,3,2};
        System.out.println(ComputeLenOfLinkedList(array));
    }
}
