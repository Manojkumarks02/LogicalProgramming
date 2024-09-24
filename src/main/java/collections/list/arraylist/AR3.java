package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AR3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("manoj");
        arrayList.add("john");
        arrayList.add("adams");
        arrayList.add("smith");

        // Filtering using Streams
        List<String> collect = arrayList
                .stream()
                .filter(names -> names.startsWith("m"))
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-----------------------------");

        //mapping using streams

        List<String> collect1 = arrayList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
