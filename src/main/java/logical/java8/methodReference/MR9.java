package logical.java8.methodReference;

import java.util.function.Function;

public class MR9 {
    //Method Reference in Higher-Order Functions
    public static void main(String[] args) {
        Function<Function<Integer, Integer>, Integer> applyTwice = f -> f.apply(f.apply(2));
        int result = applyTwice.apply(MR9::increment);
        System.out.println("Result: " + result);  // Output: 4
    }

    public static int increment(int x) {
        return x + 1;
    }
}
