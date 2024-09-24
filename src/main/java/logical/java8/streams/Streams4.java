package logical.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams4{
    public static void main(String[] args) {
        //Parallel Stream

        int[] arr = {1,2,3};
        Arrays.stream(arr).parallel().map(num -> num * num).forEach(System.out::println);
        System.out.println("-------------------------");

        int sum = IntStream.rangeClosed(1, 10).parallel().sum();
        System.out.println(sum);
        System.out.println("-------------------------");

        IntStream.rangeClosed(1, 10).parallel().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("---------------------------");

        List<Integer> collected = IntStream.rangeClosed(1, 10).parallel().filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(collected);
        System.out.println("--------------------------");
    }
}
