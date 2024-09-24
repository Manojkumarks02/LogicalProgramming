package logical.java8.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams3 {
    public static void main(String[] args) {

        //findFirst
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Integer firstElement = stream.findFirst().orElse(null);
        System.out.println("First element: " + firstElement);
        System.out.println("----------------------------------");

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Integer anyElement = stream1.findAny().orElse(null);
        System.out.println("Any element: " + anyElement);

        int anyEven = IntStream.range(1, 10)
                .parallel()
                .filter(x -> x % 2 == 0)
                .findAny()
                .orElse(-1);
        System.out.println("Any even number: " + anyEven);
        System.out.println("-----------------------------------");

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        boolean anyMatch = stream3.anyMatch(x -> x > 3);
        System.out.println("Any match greater than 3? " + anyMatch);
        System.out.println("---------------------------------------");

        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
        stream4.limit(3).forEach(System.out::println); //limit(): Limits the number of elements in the stream.
        System.out.println("---------------------------------------");

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
        stream5.skip(2).forEach(System.out::println); //skip(): Skips the first n elements in the stream.
        System.out.println("-----------------------------------------");

        Stream<Integer> stream6 = Stream.of(1, 2, 2, 3, 3, 4, 5);
        stream6.distinct().forEach(System.out::println);
    }
}

