package logical.string;


import java.util.stream.Collectors;

// converting the case of the character
public class CaseConvertor {
    public static void main(String[] args) {
        String str = "ManOj";
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            } else {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
