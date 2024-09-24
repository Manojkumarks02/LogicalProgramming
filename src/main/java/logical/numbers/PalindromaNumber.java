package logical.numbers;

public class PalindromaNumber {
    public static void main(String[] args) {
        int number = 12321; // Replace with any number you want to check

        int n = number;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (rev == number)
            System.out.println(number + " is a palindrome number");
        else
            System.out.println(number + " is not a palindrome number");
    }
}
