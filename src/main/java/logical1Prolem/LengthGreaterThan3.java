package logical1Prolem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGreaterThan3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("manoj", "kumar", "kkl", "llmn", "mam");

//        list.stream().filter(n -> n.length() > 3).forEach(System.out::println);

        List<String> collect = list.stream().filter(n -> n.length() > 3).collect(Collectors.toList());
        System.out.println(collect);

    }
}
