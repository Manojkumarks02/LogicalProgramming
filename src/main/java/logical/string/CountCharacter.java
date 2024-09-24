package logical.string;

//counting the number of characters in strings
public class CountCharacter {

    public static void main(String[] args) {
        String str = "manojkumarksoko";
        int count=0;

        for(int i =0; i<str.length()-1;i++){
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                count++;
            }
        }
        System.out.println("No of Characters = " + count);

    }
}
