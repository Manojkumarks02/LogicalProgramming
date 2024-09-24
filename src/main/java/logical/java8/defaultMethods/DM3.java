package logical.java8.defaultMethods;

//. Using Default Methods in Multiple Interfaces

interface InterfaceA {
    default void defaultMethod() {
        System.out.println("Default method in InterfaceA");
    }
}

interface InterfaceB {
    default void defaultMethod() {
        System.out.println("Default method in InterfaceB");
    }
}

class MyClass2 implements InterfaceA, InterfaceB {
    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod(); // Calling InterfaceA's default method
        InterfaceB.super.defaultMethod(); // Calling InterfaceB's default method
    }
}
public class DM3{
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        myClass2.defaultMethod();
    }
}
