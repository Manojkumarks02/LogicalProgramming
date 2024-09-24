package logical.java8.lambda;

//Lambda with Single Parameter

@FunctionalInterface
interface Sayable1{
    public String say(String name );
}

public class Lambda2 {
    public static void main(String[] args) {
        Sayable1 s1 = (name) -> {
            return "hello " + name;
        };
        System.out.println(s1.say("manoj"));

        //we can use argument without backet
        Sayable1 s2 = name -> {
            return "hello " + name ;
        };
        System.out.println(s2.say("John"));
    }
}
