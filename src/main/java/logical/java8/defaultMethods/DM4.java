package logical.java8.defaultMethods;

//. Default Methods with Static Methods in Interface

interface MyInterface3 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass3 implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented.");
    }
}
public class DM4 {
    public static void main(String[] args) {
        MyClass3 myClass3 = new MyClass3();
        myClass3.abstractMethod();
        myClass3.defaultMethod();
        MyInterface3.staticMethod();
    }
}
