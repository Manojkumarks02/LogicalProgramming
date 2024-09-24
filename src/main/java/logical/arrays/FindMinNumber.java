package logical.arrays;

//finding the minimum value of the array
public class FindMinNumber {
    public static void main(String[] args) {

        int[] num = {100,2,3,4,55,6,7,8,99};
        int min = num[0];

        for(int i =1; i< num.length;i++){
            if(num[i] < min){
                min=num[i];
            }
        }
        System.out.println("The Minimum value in the array is: " + min);
    }
}
