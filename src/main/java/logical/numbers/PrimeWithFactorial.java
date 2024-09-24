package logical.numbers;

public class PrimeWithFactorial {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        int num1 = num;
        int fact = 1;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " : is prime number");
            for (int j = 1; j <= num; j++) {
                fact = fact * j;
            }
            System.out.println("factorial of number :" + num + " is " + fact);

        } else {
            System.out.println(num + " : is not a prime number");
        }


    }
}
