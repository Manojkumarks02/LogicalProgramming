package logical.java8.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("manoj", "kumar", "john", "adams");
        List<String> collect = list.stream().filter(names -> names.startsWith("m")).collect(Collectors.toList());
        System.out.println(collect.get(0));//manoj
        System.out.println(collect);// [manoj]

        System.out.println("----------------------------------------------");

        List<String> collect1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1.get(0));
        System.out.println("----------------------------------------------");


        list.stream().filter(names -> names.startsWith("k")).forEach(System.out::println);

        System.out.println("----------------------------------------------");

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
        System.out.println("----------------------------------------------");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> sum = list1.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());

        System.out.println("----------------------------------------------");

        //converting the wrapper object to primitives
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 99);

        list2.stream().mapToInt(Integer::intValue).forEach(System.out::println);

        IntStream intStream = list2.stream().mapToInt(Integer::intValue);
        intStream.forEach(System.out::print);

        intStream.forEach(x -> System.out.print(x + " "));  //for getting the space between two data,

    }
}
