package logical.java8.methodReference;

import java.util.function.Function;

public class MR2 {
    //Reference to an Instance Method of a Particular Object

    public static void main(String[] args) {
        String str = "Hello, World!";
        Function<String, Integer> stringLength = String::length;
        int length = stringLength.apply(str);
        System.out.println("String Length: " + length);

    }
}
