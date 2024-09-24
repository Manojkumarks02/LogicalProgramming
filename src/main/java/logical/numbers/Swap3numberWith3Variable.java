package logical.numbers;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;

public class Swap3numberWith3Variable {

    public static void main(String[] args) {
        int i =1;
        int j= 2;
        int p =3;
        int k;


       k =i;
       i=j;
       j=p;
       p=k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(p);


    }
}

