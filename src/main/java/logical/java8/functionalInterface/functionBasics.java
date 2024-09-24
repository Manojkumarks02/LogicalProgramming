package logical.java8.functionalInterface;

@FunctionalInterface
interface MyFunctionalInterface{
    void message(String s);
}
public class functionBasics {
    public static void main(String[] args) {
        MyFunctionalInterface myfuction = (s) -> System.out.println("hi " + s);
        myfuction.message("world");
    }
}
