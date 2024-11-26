package logical.arrays;

public class RotateKelemnts {

    // Function to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array by K steps
    public static void rotate(int[] arr, int k) {
        int n = arr.length;

        // Normalize k to be within the bounds of the array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first K elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n - K elements
        reverse(arr, k, n - 1);
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;

        rotate(arr, k);
        printArray(arr);
    }
}
