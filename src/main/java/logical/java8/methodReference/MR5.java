package logical.java8.methodReference;

//Method Reference with Custom Functional Interface


import java.util.Locale;
import java.util.function.BiFunction;

interface StringProcessor{
    String process(String str);
}
public class MR5 {
    public static void main(String[] args) {
       StringProcessor stringProcessor=String::toUpperCase;
        String result = stringProcessor.process("hello MAnoj!");
        System.out.println(result);
    }
}
