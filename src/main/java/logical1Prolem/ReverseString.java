package logical1Prolem;

public class ReverseString {
    public static void main(String[] args) {

        String str = "mnaojkumar";
        char ch[] = str.toCharArray();

        for (int i = 0; i< str.length()/2; i++){
            char c = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = c;
        }

        str = new String(ch);
        System.out.println(str);
    }
}
