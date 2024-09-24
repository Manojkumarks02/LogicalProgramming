package logical.java8.lambda;
//using forEach

import java.util.ArrayList;

public class Lambda5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("manoj");
        arrayList.add("kumar");
        arrayList.add("john");
        arrayList.add("smith");

        arrayList.forEach(names -> System.out.println(names));
    }
}
