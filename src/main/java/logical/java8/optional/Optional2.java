package logical.java8.optional;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Hello World!");

        if(optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("values are not present");
        }
        System.out.println("-------------------------------");

        Optional<String> upperCase = optional.map(String::toUpperCase);
        upperCase.ifPresent(value -> System.out.println("Uppercase value: " + value));

        // Transforming value using flatMap
        Optional<String> upperCaseFlatMap = optional.flatMap(value -> Optional.of(value.toUpperCase()));
        upperCaseFlatMap.ifPresent(value -> System.out.println("Uppercase value using flatMap: " + value));

        // Filtering value
        Optional<String> filtered = optional.filter(value -> value.startsWith("Hello"));
        filtered.ifPresent(value -> System.out.println("Filtered value: " + value));
        System.out.println("----------------------------------------------------");

        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("World");

        // Combining two Optionals
        Optional<String> combined = optional1.flatMap(value1 -> optional2.map(value2 -> value1 + " " + value2));
        combined.ifPresent(System.out::println);
        System.out.println("-------------------------------------------");

        Optional<String> optional5 = Optional.ofNullable(null);

        // Providing a default value if the value is absent
        String value = optional5.orElse("Default Value");
        System.out.println("Value: " + value);

    }
}
