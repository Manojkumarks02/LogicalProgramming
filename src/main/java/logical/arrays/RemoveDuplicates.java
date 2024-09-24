package logical.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,6,7,8,8};
        int n = arr.length;
        int[] temp = new int[n];
        int j =0;

        for(int i =0; i<n-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
            System.out.print(" " + arr[i]);
        }

    }
}
