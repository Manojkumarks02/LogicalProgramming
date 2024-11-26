package logical.arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = arr[0];  // Start sum with the first element
        int maxSum = arr[0];  // Initialize maxSum with the first element

        for(int i = 1; i < arr.length; i++) {  // Start from the second element
            // Add the current element to the current sum
            sum += arr[i];

            if (sum + arr[i] < arr[i]) {
                sum = sum + arr[i];  // Continue the current subarray
            } else {
                sum = arr[i];  // Start a new subarray from the current element
            }

            // Update maxSum if the current sum is greater than the previous maxSum
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
