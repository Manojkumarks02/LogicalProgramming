package logical.string;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

//count the occurrences of each character in a string
public class CountCharacter1 {
    public static void main(String[] args) {
//        String str = "manoj kumar is from mysore";
//
//        Map<Character, Integer> countCharacter = new HashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (Character.isLetter(ch)) {
//                countCharacter.put(ch, countCharacter.getOrDefault(ch, 0) + 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : countCharacter.entrySet()) {
//            System.out.println("Character : " + entry.getKey() + " occurs " + entry.getValue());
//       }

        String str = "manoj kumar from Mysore";

        Map<Character,Long> countCharacter = str.chars().mapToObj(c -> (char) c).filter(Character::isLetter).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countCharacter.forEach((character, count) -> System.out.println(" Character : "+ character + " occurance "+ count));

    }
}
