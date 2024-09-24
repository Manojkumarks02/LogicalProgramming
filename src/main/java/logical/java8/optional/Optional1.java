package logical.java8.optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional: " + emptyOptional);

        // Creating an Optional with a value
        Optional<String> valueOptional = Optional.of("Hello");
        System.out.println("Optional with value: " + valueOptional);

        // Creating an Optional that may or may not contain a value
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println("Nullable Optional: " + nullableOptional);
        System.out.println("-------------------------------------------------------");

        Optional<String> empty = Optional.empty();
        System.out.println("Empty Optional: " + empty);

        // Creating a non-empty Optional
        Optional<String> nonEmpty = Optional.of("Hello, World!");
        System.out.println("Non-Empty Optional: " + nonEmpty);

        // Creating a nullable Optional
        Optional<String> nullable = Optional.ofNullable("Hello, World!");
        Optional<String> nullableEmpty = Optional.ofNullable(null);
        System.out.println("Nullable Optional with value: " + nullable);
        System.out.println("Nullable Optional without value: " + nullableEmpty);
    }

}
