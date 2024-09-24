package logical1Prolem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstStringWithLengthGreaterThanFive {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "grape", "pineapple", "melon");

        Optional<String> firstString = strings.stream()
                .filter(s -> s.length() > 5)
                .findFirst();

        if (firstString.isPresent()) {
            System.out.println("First string with length greater than 5: " + firstString.get());
        } else {
            System.out.println("No string with length greater than 5 found.");
        }
    }
}
