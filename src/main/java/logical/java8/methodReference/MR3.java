package logical.java8.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MR3 {

    public static void main(String[] args) {

        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.forEach(System.out::println);

        // Using method reference in stream
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperCaseWords.forEach(System.out::println);
    }
}
