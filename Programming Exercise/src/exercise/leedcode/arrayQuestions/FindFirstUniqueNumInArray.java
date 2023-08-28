package exercise.leedcode.arrayQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindFirstUniqueNumInArray {

    public static int FindFirstUniqueNumInArray(int[] array) {

        //1,4,3,3,1,2
        HashSet<Integer> set = new HashSet();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i=0; i<array.length; i++) {
            Integer element = array[i];
            if (!set.contains(element)) {
                set.add(element);
                list.add(element);
            } else {
                list.remove(element);
            }
        }
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }

    public static void main(final String[] args) {

        int[] x = {4,10,5,4,2,10};
        System.out.println(FindFirstUniqueNumInArray(x));
    }

}
