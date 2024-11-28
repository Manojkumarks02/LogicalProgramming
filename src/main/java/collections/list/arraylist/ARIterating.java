package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ARIterating {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sai");
        list.add("manoj");
        list.add("kumar");
        list.add("john");
        list.add("smith");

        for(String name : list){
            System.out.println(name);
        }
        System.out.println("-----------------------------------------");

        for( int i =0 ; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
