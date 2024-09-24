package DSA.arrays;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {

        //creation
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = new int[4];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        System.out.println("------------------------");

        // Access Elements
        System.out.println(arr[3]);
        System.out.println("------------------------");

        // Update Elements
        arr[1] = 10;
        arr[2] = 20;

        //iterating with array
        for(int i =0; i< arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("-------------------");

        //iterating with enhanced loop
        for( int number : arr){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        String[] str = {"java", "python", "c++", "go"};

        for(String words : str){
            System.out.print( words + " ");

        }

    }
}
