package logical.java8.lambda;

//with or without return keyword
@FunctionalInterface
interface Addable1{
    int add(int a, int b);
}

public class Lambda4 {
    public static void main(String[] args) {
        //without return type
        Addable1 addable1 = (a,b) -> (a+b);
        System.out.println(addable1.add(3,4));

        //with return type
        Addable1 addable2 = (a,b) -> {
            return (a+b);
        };
        System.out.println(addable2.add(9,10));
    }
}
