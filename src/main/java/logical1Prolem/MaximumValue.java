package logical1Prolem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValue {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5,98, 3, 95, 3, 8);
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        max.ifPresent(value -> System.out.println("maximum values: " +value));

    }
}
