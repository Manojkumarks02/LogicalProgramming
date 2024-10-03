package logical.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,3,4,4,5,2,6,7,7,7,8,8};

        int[] removeDuplicates = removeDuplicates(arr);
        System.out.println(Arrays.toString(removeDuplicates));
    }

    public static int[]  removeDuplicates(int[] arr){
        Set<Integer> uniqueSet = new HashSet<Integer>();

        //loop to iterate through the array
        for (int i = 0; i < arr.length; i++) {
            uniqueSet.add(arr[i]);
        }

        // Convert the set back to an array
        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }
        return result;
    }
}

