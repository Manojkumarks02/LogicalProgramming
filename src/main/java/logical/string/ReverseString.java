package logical.string;

public class ReverseString {
    public static void main(String[] args) {

        String str = "manojkumar";

        //using Java 7
        char ch[] = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            char t = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = t;
        }

        str = new String(ch);
        System.out.println(str);


        // using java 8
//        String str1 = "manojkumar";
//        String reversed = new StringBuilder(str1).reverse().toString();
//        System.out.println(reversed);


    }

}
