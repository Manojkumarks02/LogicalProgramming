package logical.arrays;

public class CountLessThanMax {
    public static void main(String[] args) {
//return the count of element which is atleast 1 element is greater than itself.
        int[] arr = {1,2,6,6,4,5};
        int max = arr[0];

        int count = 0;

        for( int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int j =0; j< arr.length; j++){
            if(arr[j] < max){
                count++ ;
            }
        }
        System.out.println(count);
    }
}
