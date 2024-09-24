package DSA.arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //Array Copy: Copy elements from one array to another.
        int[] arr = {1, 8, 9, 2, 3, 4, 5, 6};
        int[] copyOf = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyOf));
        System.out.println("----------------------------");

        //sorting the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");

        //Array Search: Search for an element in an array.
        int binarySearch = Arrays.binarySearch(arr, 3);
        System.out.println(binarySearch);
        System.out.println("--------------------------");

        //fill array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        System.out.println("-----------------------------");

        // Array Conversion
        String[] strArray = {"Java", "Python", "C++"};
        java.util.List<String> list = Arrays.asList(strArray);
        System.out.println("Array to List: " + list);

    }
}
