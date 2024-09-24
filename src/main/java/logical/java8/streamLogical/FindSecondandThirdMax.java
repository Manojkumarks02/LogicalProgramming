package logical.java8.streamLogical;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class FindSecondandThirdMax {
    public static void main(String[] args) {

        //for list
        List<Integer> list = Arrays.asList(1, 24, 55, 6, 7, 4,4,4,55,2);
        List<Integer> collected = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(collected);

        int secondMax = collected.get(collected.size()-2);
        int thirdMax = collected.get(collected.size()-3);

        System.out.println(secondMax);
        System.out.println(thirdMax);
        System.out.println("---------------------------------------");

        int[] arr = {1,3,22,33,22,90,29,2};
        int[] array = Arrays.stream(arr).distinct().sorted().toArray();

        int secondMaxi = array[array.length-2];
        int thirdMaxi = array[array.length-3];
        int forth = array[array.length-4];

        System.out.println(secondMaxi);
        System.out.println(thirdMaxi);
        System.out.println(forth);
    }
}
