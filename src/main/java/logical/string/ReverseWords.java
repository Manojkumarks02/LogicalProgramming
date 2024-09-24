package logical.string;

public class ReverseWords {

    public static void main(String[] args) {
        String sentence = " manoj kumar ks";

        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Print the reversed sentence
        System.out.println("The reversed words of the sentence are: " + reversedSentence.toString().trim());
    }
}


