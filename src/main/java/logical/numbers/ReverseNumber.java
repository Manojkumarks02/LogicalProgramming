package logical.numbers;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 123456;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }

        System.out.println(reverse);
    }
}