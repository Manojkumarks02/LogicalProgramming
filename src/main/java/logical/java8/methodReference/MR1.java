package logical.java8.methodReference;

import java.util.Comparator;
import java.util.function.BiFunction;

public class MR1 {
    //Reference to a Static Method
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition = MR1::add;
        int  result = addition.apply(5, 3);
        System.out.println(result);

    }
}
