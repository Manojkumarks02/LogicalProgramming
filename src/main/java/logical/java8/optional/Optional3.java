package logical.java8.optional;

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("hello Manoj");

        Optional<String> optional1 = optional.flatMap(value -> Optional.of(value.toUpperCase()));
        System.out.println(optional1.orElse("no values"));
        System.out.println("------------------------------");

        // Filtering a value
        Optional<String> filteredOptional = optional.filter(value -> value.length() > 3);
        System.out.println("Filtered Value: " + filteredOptional.orElse("No Value"));
        System.out.println("--------------------------------");

        Optional<String> optional3 = Optional.ofNullable(null);
        // Throwing an exception if the value is absent
        try {
            String value = optional3.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
            System.out.println("Value: " + value);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
