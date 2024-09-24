package logical.java8.defaultMethods;

interface MyInterface{
    //abstract method
    void abstractMethod();

    //default method
    default void defaultMethod(){
        System.out.println("this is default method..!");
    }
}

class MyClass implements MyInterface{

    @Override
    public void abstractMethod() {
        System.out.println("this is abstarct method..!");
    }
}

public class DM1{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod();
        myClass.defaultMethod();
    }
}
