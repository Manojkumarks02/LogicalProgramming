package logical.java8.streamLogical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        List<Integer> collected = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(collected);

        System.out.println("------------------------------------------");

        List<String> list1 = Arrays.asList("manoj", "kumar", "sai");
        List<String> collect = list1.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------------------------------");

        int[] array  = {1,2,2,3,4,5,6,6,7,8,8,9,10,10};
        int[] array1 = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println("---------------------------------------------");


        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("-----------------------------------------------");

        List<List<Integer>> list3 = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(5)
        );

        int sum1 = list3.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);
        System.out.println("--------------------------------------------------");

        List<Integer> list4 = Arrays.asList(1, 2, 3, 10, 88, 90);
        long count = list4.stream().filter(n -> n >= 10).count();
        System.out.println(count);
        System.out.println("----------------------");



    }
}
