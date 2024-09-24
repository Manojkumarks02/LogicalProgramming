package logical.numbers;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;

public class SquareRoot {
    public static void main(String[] args) {

        //finding the SquareRoot of number
        int num =  38;
        int result = 0;

        for(int i =0; i* i <= num ; i++){
            result = i;
        }
        System.out.println(result);

        System.out.println("-------------------------------------------------------");
        //finding the square

        int num1 = 9;
        int square = 1;

        for( int i =1; i <= num1; i++){
            square = i*i;
        }
        System.out.println(square);
    }
}
