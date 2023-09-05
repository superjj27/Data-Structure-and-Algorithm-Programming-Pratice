package exercise.codility.CountingElements;

import java.util.HashSet;
import java.util.Set;

//Find the smallest positive integer that does not occur in a given sequence.
public class MissingInteger {

    public static int FindSmallestPositiveNumberMissingInArray(int[] A) {

        if(A.length ==0){
            return 1;
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i< A.length; i++){
            set.add(A[i]);
        }

        for(int i=1; i<= A.length; i++){
            if(!set.contains(i)) // the 1st missing element
                return i;
        }

        return A.length+1;

    }

    public static void main(final String[] args) {
        //System.out.println(FindSmallestPositiveNumberMissingInArray(new int[] {1,3,6,4,1,2}));
        //System.out.println(FindSmallestPositiveNumberMissingInArray(new int[] {1,2,3}));
        System.out.println(FindSmallestPositiveNumberMissingInArray(new int[] {-1,-3}));
        //System.out.println(FindSmallestPositiveNumberMissingInArray(new int[] {0,9}));

    }
}


