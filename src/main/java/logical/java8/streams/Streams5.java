package logical.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams5 {
    public static void main(String[] args) {
        // flatmap's operations
        //Flattening a List of Lists
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> flattened = numbers.stream()
                                         .flatMap(List::stream)
                                         .collect(Collectors.toList());

        System.out.println("Flattened list: " + flattened);
        System.out.println("---------------------------------------");

        //Splitting Strings and Flattening the Result
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams",
                "FlatMap example"
        );
        List<String> words = sentences.stream()
                                      .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                                      .collect(Collectors.toList());
        String result = String.join(" ", words); // used this for remove []
        System.out.println("Flattened words: " + words);
        System.out.println("-------------------------------------");

        //Flattening a List of Arrays
        List<String[]> listOfArrays = Arrays.asList(
                new String[]{"apple", "banana"},
                new String[]{"orange", "grape"},
                new String[]{"pear", "mango"}
        );

        // Flattening the list of arrays
        List<String> flatList = listOfArrays.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flatList);
        System.out.println("-------------------------------");

        // Flattening a Stream of Streams
        Stream<Stream<String>> streamOfStreams = Stream.of(
                Stream.of("apple", "banana"),
                Stream.of("orange", "grape"),
                Stream.of("pear", "mango")
        );

        // Flattening the stream of streams
        List<String> flatList1 = streamOfStreams
                .flatMap(s -> s)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flatList1);
        System.out.println("----------------------------");

        //Using flatMap with Optional
        List<Optional<String>> optionals = Arrays.asList(
                Optional.of("carrot"),
                Optional.empty(),
                Optional.of("beetroot"),
                Optional.of("capsicum")
        );

        // Flattening the list of Optionals
        List<String> flatList2 = optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flatList2);
    }
}
