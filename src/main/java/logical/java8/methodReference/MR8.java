package logical.java8.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MR8 {
    public static void main(String[] args) {
        //Combining Multiple Method References

        List<String> words = Arrays.asList("apple", "mango", "grapes", "pineApple");
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .map(MR8::appendExclamation)
                .collect((Collectors.toList()));

        System.out.println(result);
    }
    public static String appendExclamation(String str) {
        return str + "!";
    }
}
