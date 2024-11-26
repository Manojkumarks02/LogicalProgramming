package logical.arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5};

        // Step 1: Find the maximum number (N) in the array
        int n = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]> n){
                n = arr[i];
            }
        }

        // Step 2: Calculate total sum of numbers from 1 to n
        int totalSum = n * (n+1) /2;

        // Step 3: Calculate sum of elements in the array
        int arraySum = 0;
        for(int i =0; i<arr.length; i++){
            arraySum += arr[i];
        }

        // Step 4: Find the missing number
        int missingNumber = totalSum - arraySum;

        System.out.println(missingNumber);
    }
}
