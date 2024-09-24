package logical.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

// merging the two arrays
public class MergeTwoArray {
    public static void main(String[] args) {

        //using Java 7
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] mergeArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergeArray[i] = arr1[i];

        }
        for (int j = 0; j < arr2.length; j++) {
            mergeArray[arr2.length + j] = arr2[j];
        }

        System.out.println("Merged array: " + Arrays.toString(mergeArray));

        //using Java 8
        int[] array1 = {11, 13, 15, 17};
        int[] array2 = {12, 14, 16, 18};

        int[] mergedArray = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();

        System.out.println("Merged array: " + Arrays.toString(mergedArray));


    }
}
