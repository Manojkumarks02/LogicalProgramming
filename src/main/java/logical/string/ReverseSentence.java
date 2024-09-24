package logical.string;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "hello how are you";
        char[] characters = str.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            StringBuilder word = new StringBuilder();

            // Extract each word
            while (i >= 0 && characters[i] != ' ') {
                word.insert(0, characters[i]);
                i--;
            }

            // Append the reversed word to the result
            reversed.append(word).append(' ');
        }

        System.out.println("The reversed sentence is: " + reversed.toString().trim());
    }
}
