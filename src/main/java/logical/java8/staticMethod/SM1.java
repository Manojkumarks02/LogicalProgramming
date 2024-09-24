package logical.java8.staticMethod;

@FunctionalInterface
interface MyManoj1{
    int add(int a, int b);

    static  int add1( int a, int b){
        return a+b;
    }
}

public class SM1 {
    public static void main(String[] args) {
        int sum = MyManoj1.add1(3,5);
        System.out.println(sum);
    }
}
