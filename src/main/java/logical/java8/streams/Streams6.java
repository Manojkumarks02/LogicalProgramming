package logical.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams6 {
    public static void main(String[] args) {
        List<Optional<String>> optionals = Arrays.asList(
                Optional.of("apple"),
                Optional.empty(),
                Optional.of("banana"),
                Optional.of("orange")
        );
        // Filtering non-empty Optionals and collecting them into a list
        List<String> nonEmptyValues = optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        System.out.println("Non-empty values: " + nonEmptyValues);
        System.out.println("--------------------------------------------");

        Stream<String> names = Stream.of("Alice", "Bob", "Charlie", "David");

        // Finding the first name starting with "C"
        Optional<String> nameStartingWithC = names.filter(name -> name.startsWith("C"))
                .findFirst();

        // Printing the result
        nameStartingWithC.ifPresentOrElse(
                name -> System.out.println("Found: " + name),
                () -> System.out.println("No name found")
        );
        System.out.println("----------------------------------------------");

        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Finding a name containing "z"
        Optional<String> nameWithZ = names1.stream()
                .filter(name -> name.contains("z"))
                .findAny();

        // Using orElse to provide a default value
        String result = nameWithZ.orElse("No name contains 'z'");

        System.out.println(result);
        System.out.println("----------------------------------------------");

        Optional<String> name2 = Optional.of("Alice");

        // Transforming the value inside Optional using flatMap
        Optional<Integer> nameLength = name2.flatMap(n -> Optional.of(n.length()));

        // Printing the result
        nameLength.ifPresent(len -> System.out.println("Name length: " + len));
        System.out.println("------------------------------");

        List<Optional<Integer>> optionalNumbers = Arrays.asList(
                Optional.of(1),
                Optional.empty(),
                Optional.of(3),
                Optional.of(4),
                Optional.empty()
        );

        // Summing up all present values
        int sum = optionalNumbers.stream()
                .flatMap(Optional::stream)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of present values: " + sum);
        System.out.println("------------------------------------");

        IntStream numbers = IntStream.of(1, 2, 3, 4, 5);

        // Finding the maximum value
        OptionalInt max = numbers.max();

        // Printing the result
        if (max.isPresent()) {
            System.out.println("Max value: " + max.getAsInt());
        } else {
            System.out.println("Stream is empty");
        }
    }
}
