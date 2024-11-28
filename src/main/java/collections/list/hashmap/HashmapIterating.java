package collections.list.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapIterating {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"manoj");
        map.put(2,"kumar");
        map.put(3,"sai");

        //traditional for
        for (Map.Entry<Integer ,String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

//        for-each loop
        for(Integer key : map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }


    }
}
