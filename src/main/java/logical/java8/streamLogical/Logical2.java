package logical.java8.streamLogical;


import java.util.ArrayList;

public class Logical2 {

    public static void main(String[] args) {

        //find the number in list or else throw null
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(2);

        Object o = arrayList.stream()
                .filter(arrayList1 -> arrayList1.equals(2))
                .findAny()
                .orElse(null);

        System.out.println(o);
    }
}

