package logical.arrays;

public class FindPairsWithSum {
    public static void main(String[] args) {
        //find the pairs in array which is equal to k i.e, arr[i] + arr[j] ==k, and arr[i] != arr[j]

        int[] arr = {1,5,7,8,3};
        int k = 6 ; // they will give the k values
        int sum = 0;

        for(int i =0; i< arr.length; i++){
            for(int j =0; j< arr.length; j++){

                if( i != j){
                    sum = arr[i] + arr[j];

                    if(sum == k){
                       System.out.println(arr[i] + " + " + arr[j]);

                    }
                }
                //or in short
//                if(arr[i] != arr[j] && arr[i]+arr[j] == k){
//                    System.out.println(arr[i] + " + " + arr[j]);
//                }
            }
        }
    }
}
