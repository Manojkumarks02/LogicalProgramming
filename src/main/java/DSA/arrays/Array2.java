package DSA.arrays;

public class Array2 {
    public static void main(String[] args) {
        int[][] arr = {
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}
                      };

        // Access Elements
        System.out.println(arr[1][1]);
        System.out.println("------------------------------");

        //update the Element
        arr[0][0] = 10;

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------");

    }
}
