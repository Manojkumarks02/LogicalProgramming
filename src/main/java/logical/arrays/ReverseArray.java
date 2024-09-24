package logical.arrays;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;

public class ReverseArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};

        for(int i =0; i<num.length/2; i++){
            int t = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = t;

        }

        for(int j=0; j<num.length;j++){
            System.out.print(" "+num[j]);
        }
    }
}
