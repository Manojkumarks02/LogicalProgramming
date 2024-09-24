package logical.arrays;

public class swapping {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        //swapping only first and last index
        int start = 0;
        int end = arr.length - 1;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println("-------------------------------------------");
        //swapping the middle index have same first and last

        int[] num ={1,2,3,4,5,6};
        int sp = 1;
        int ep = 4;
        reverse(num, sp, ep);
    }

    private static void reverse(int[] num, int sp, int ep) {
        while
        (sp < ep) {
            int temp = num[sp];
            num[sp] = num[ep];
            num[ep] = temp;
            sp++;
            ep--;
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
