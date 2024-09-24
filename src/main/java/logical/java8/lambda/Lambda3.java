package logical.java8.lambda;

//Lambda with Multiple Parameters

@FunctionalInterface
interface Addable{
    int add(int a, int b);
}

public class Lambda3 {
    public static void main(String[] args) {

        //witout the datatype
        Addable multiple1 = (a,b) -> (a*b);
        System.out.println(multiple1.add(10,20));

        //with datatype
        Addable add1 = (int a,int b) -> (a+b);
        System.out.println(add1.add(20,70));

    }
}
