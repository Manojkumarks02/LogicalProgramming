package logical.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        //group By and Count
        List<String> list = Arrays.asList("manoj", "kumar", "john", "adam", "simth");
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);


        // Group fruits by name and count occurrences
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple", "date", "banana");
        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));

        System.out.println("Fruit counts: " + fruitCount);
    }
}
