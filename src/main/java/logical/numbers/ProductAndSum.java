package logical.numbers;

public class ProductAndSum {
    public static void main(String[] args) {
// retun the defference value between the product and sum


        int num = 123;
        int sum = 0;
        int prod = 1;

        while( num > 0 ){
            int n = num%10;
            sum += n;
            prod *= n;
            num = num/10;
        }

        System.out.println(prod - sum);
    }
}

