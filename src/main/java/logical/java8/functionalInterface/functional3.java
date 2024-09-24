package logical.java8.functionalInterface;

//functional interface with Generics and default method;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);

    // Default method
    default T convertWithPrefix(F from, String prefix) {
        return convert((F) (prefix + from.toString()));
    }
}

public class functional3 {

    public static void main(String[] args) {
        Converter<String, Integer> stringToInteger = Integer::valueOf;
        Converter<Integer, String> integerToString = String::valueOf;

        Integer convertToInteger = stringToInteger.convert("123");
        String convertToString = integerToString.convert(123);


        //using default methodss
        System.out.println(stringToInteger.convertWithPrefix("123", "Number: "));
    }

}
