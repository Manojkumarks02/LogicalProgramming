package logical.java8.defaultMethods;

// Overriding a Default Method

interface MyInterface1{

    void abstract1();

    default void defacultMethod1(){
        System.out.println("this is default method");
    }
}

class MyClass1 implements MyInterface1{

    @Override
    public void abstract1() {
        System.out.println("abstract method is implemented");
    }
    @Override
    public void defacultMethod1(){
        System.out.println("default method is overridden..!");
    }
}

public class DM2 {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        myClass1.abstract1();
        myClass1.defacultMethod1();
    }

}
