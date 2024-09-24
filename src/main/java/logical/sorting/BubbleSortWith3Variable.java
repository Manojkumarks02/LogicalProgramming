package logical.sorting;

public class BubbleSortWith3Variable {
    public static void main(String[] args) {

        int[] num = {1, 5, 3, 4, 9, 2, 8, 7};

        for (int j = 0; j < num.length - 1; j++) {

            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {  //use< for desending
                    int temp = num[i]; //with 3rd variable
                    num[i] =num[i+1];
                    num[i+1] = temp;
                }
            }
        }

        for (int k =0; k<num.length;k++){
            System.out.print(num[k]);
        }
    }
}
