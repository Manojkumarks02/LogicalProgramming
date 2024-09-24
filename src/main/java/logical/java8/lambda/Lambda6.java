package logical.java8.lambda;
//lambda with multiple statements;

@FunctionalInterface
interface Sayable2{
    String say(String message);
}
public class Lambda6 {
    public static void main(String[] args) {
        Sayable2 sayable2 = message -> {
            String s1 = "i wolud like to thank you";
            String s2 = s1 + message;
            return s2;
        };
        System.out.println(sayable2.say(" Manoj"));
    }
}
