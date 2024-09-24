package logical.numbers;

public class AddNaturalNum {
    public static void main(String[] args) {
        // adding the natural numbers, if we give 6 the it will add from 1 to 6: 6+5+4+3+2+1 =21
        int num = 6;
        int sum = 0;

        for(int i =0; i<= num ; i++){
            sum += i;
        }
        System.out.println(sum);

        // product of the natural numbers, if we give 6 the it will multiply from 1 to 6: 6*5*4*3*2*1 =720

        int num1 = 6;
        int prod = 1;

        for(int i =1; i <= num1; i++){
            prod *= i;
        }
        System.out.println(prod);



    }
}
