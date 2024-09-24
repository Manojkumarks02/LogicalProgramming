package logical.java8.lambda;

//Lambda expression without parameters

@FunctionalInterface
interface Sayable{
    public String say();
}

public class Lambda1 {
    public static void main(String[] args) {

        Sayable s = () -> {
            return "i have to say somthing";
        };

        System.out.println(s.say());
    }
}
