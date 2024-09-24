package logical.numbers;

public class SwapNumberWithout3Variable {
    public static void main(String[] args) {
        int i =30;
        int j = 50;
        i= i+j;
        j= i-j;
        i=i-j;
        System.out.println(i);
        System.out.println(j);
    }
}
