package logical1Prolem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6, 7);

        List<Integer> collected = list.stream().map(n -> n * n).distinct().collect(Collectors.toList());
        System.out.println(collected);

    }
}
