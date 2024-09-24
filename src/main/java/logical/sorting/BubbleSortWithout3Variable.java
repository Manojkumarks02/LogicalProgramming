package logical.sorting;

public class BubbleSortWithout3Variable {
    public static void main(String[] args) {

        int[] num = {1, 3, 2, 5, 4, 6, 7, 9, 8};

        for (int j = 0; j < num.length - 1; j++) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    num[i] = num[i] + num[i + 1];
                    num[i + 1] = num[i] - num[i + 1];
                    num[i] = num[i] - num[i + 1];
                }
            }
        }


        for (int m =0;m<num.length;m++){
            System.out.print(" " +num[m]);
        }
    }
}
