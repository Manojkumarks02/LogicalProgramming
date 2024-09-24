package logical.arrays;

public class FindSecondMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 34, 4,42, 43,44, 3};

        int max = arr[0];
        int secondMax = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
