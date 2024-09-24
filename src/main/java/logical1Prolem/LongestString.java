package logical1Prolem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        // using java 8
        List<String> list = Arrays.asList("manoj", "kumar", "Manojkumar","johnmakimj", "john", "adam");
        Optional<String> reduce = list.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        reduce.ifPresent(s -> System.out.println(s));

        //without java 8
        List<String> strings = Arrays.asList("apple", "banana", "pineapple", "cherry", "strawberry");

        // Initialize a variable to hold the longest string
        String longestString = "";

        // Iterate through the list to find the longest string
        for (String s : strings) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }

        // Print the longest string
        if (!longestString.isEmpty()) {
            System.out.println("Longest string: " + longestString);
        }
    }
}
