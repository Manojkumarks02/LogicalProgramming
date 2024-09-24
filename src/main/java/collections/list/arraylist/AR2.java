package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AR2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("mango");
        list.add("apple");
        list.add("grapes");
        list.add("blueberry");

        // Checking if an element exists
        boolean grapes = list.contains("grapes");
        System.out.println(grapes); //true
        System.out.println("--------------------------");

        // Checking the size of the ArrayList
        int size = list.size();
        System.out.println(size); //4
        System.out.println("---------------------------");

        //Sorting the Arraylist
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------------------");

        // Sorting in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println("------------------------------");



    }

}
