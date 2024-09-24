package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AR4 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Converting ArrayList to array
        String[] array = fruits.toArray(new String[0]);

        for( String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("-----------------------------------------");

        // Synchronizing the ArrayList
        List<String> synchronizedFruits = Collections.synchronizedList(fruits);

        // Synchronized block to iterate over synchronized list
        synchronized (synchronizedFruits) {
            for (String fruit : synchronizedFruits) {
                System.out.println(fruit);
            }
        }

    }
}
