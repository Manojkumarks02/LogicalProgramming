package logical.arrays;

//finding the Maximum value in the Array
public class FindMaxNumber {
    public static void main(String[] args) {

        int[] num = {100,2,3,4,55,6,7,8,99};
        int max = num[0];

        for(int i =1; i< num.length;i++){
            if(num[i] > max){
                max=num[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}
