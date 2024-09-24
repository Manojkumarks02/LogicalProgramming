package logical1Prolem;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}