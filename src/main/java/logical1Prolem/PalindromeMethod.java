package logical1Prolem;

public class PalindromeMethod {

    public static boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        return rev == num;
    }

    public static void main(String[] args) {
        int num = 1234321;

        if (isPalindrome(num)) {
            System.out.println(num + " : is a palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }
    }
}
