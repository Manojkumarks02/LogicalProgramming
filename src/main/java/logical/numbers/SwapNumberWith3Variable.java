package logical.numbers;

public class SwapNumberWith3Variable {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k;

        k = i;
        i = j;
        j = k;

        System.out.println(i);
        System.out.println(j);
    }
}
