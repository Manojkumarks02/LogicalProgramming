package logical.java8.functionalInterface;

//fuctional interface with parameter and return type

@FunctionalInterface
interface MathOperation{
    int operation(int a, int b);
}

public class Fuctional2 {
    public static void main(String[] args) {
        MathOperation addition = (a,b) -> a+b;
        System.out.println(performOperation(3,5,addition));

    }

    private static int performOperation(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
