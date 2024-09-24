package collections.list.arraylist;

import java.util.ArrayList;

public class AR1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("main");
        arrayList.add("manoj");
        arrayList.add("kumar");
        arrayList.add("john");

        // Accessing elements by index
        String name = arrayList.get(1);
        System.out.println(name);
        System.out.println("------------------------------------");

        // Iterating over elements
        for(String names : arrayList){
            System.out.println(names);
        }
        System.out.println("-----------------------------------");

        // Modifying an element
        arrayList.set(1, "adam");
        System.out.println(arrayList);
        System.out.println("--------------------------");

        // Removing an element
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println("------------------------------");

    }
}
