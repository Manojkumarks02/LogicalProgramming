package logical.java8.defaultMethods;

// Default Methods in Functional Interfaces

@FunctionalInterface
interface MyFunctionalInterface {
    void singleAbstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }
}

public class DM5 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("abstract method Implemented");
        myFunctionalInterface.singleAbstractMethod();
        myFunctionalInterface.defaultMethod();
    }
}
