package logical.java8.functionalInterface;

@FunctionalInterface
interface Converter1<F, T> {
    T convert(F from);

    // Default method
    default T convertWithPrefix(F from, String prefix) {
        return convert((F) (prefix + from.toString()));
    }
}
public class functional4 {
    public static void main(String[] args) {
        Converter1<String, Integer> stringToInteger = Integer::valueOf;
        Converter1<Integer, String> integerToString = String::valueOf;

        Integer convertedInteger = stringToInteger.convert("123");
        String convertedString = integerToString.convert(123);

        System.out.println("Converted to Integer: " + convertedInteger);
        System.out.println("Converted to String: " + convertedString);

        // Using the default method
        System.out.println("Converted with Prefix: " + stringToInteger.convertWithPrefix("123", "Number: "));
    }
}
