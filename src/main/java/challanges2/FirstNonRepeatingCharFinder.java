package challanges2;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharFinder {
    public static char getFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charactersCount = new HashMap<>();
        char[] characters = str.toCharArray();
        for (char character : characters) {
            if (charactersCount.containsKey(character)) {
                int count = charactersCount.get(character);
                count++;
                charactersCount.put(character, count);
            } else {
                charactersCount.put(character, 1);
            }
        }
        for (char character : characters) {
            if (charactersCount.get(character) < 2) {
                return character;
            }
        }
        return ' ';
    }
}
