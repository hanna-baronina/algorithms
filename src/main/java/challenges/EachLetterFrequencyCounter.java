package challenges;

import java.util.HashMap;
import java.util.Map;

public class EachLetterFrequencyCounter {

    public static Map<Character, Integer> countFrequencyOfEachLetter(String sentence) {
        char[] charactersArray = sentence.toLowerCase().toCharArray();
        Map<Character, Integer> charactersCount = new HashMap<>();

        for (char character : charactersArray) {
            int charCode = character - 'a';
            if (charCode >= 0 && charCode < 26) {
                if (charactersCount.containsKey(character)) {
                    int count = charactersCount.get(character);
                    charactersCount.put(character, count + 1);
                } else {
                    charactersCount.put(character, 1);
                }
            }
        }
        return charactersCount;
    }
}
