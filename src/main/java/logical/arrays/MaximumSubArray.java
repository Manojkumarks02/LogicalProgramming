package logical.arrays;

//using the Kadane’s Algorithm solves this problem in O(n) time complexity
public class MaximumSubArray {

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4, -1, 2};

        int currentSum = 0;         // Tracks the sum of the current subarray
        int maxSum = arr[0];        // Initialize maxSum with the first element of the array

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Update maxSum if the currentSum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Print the result
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}