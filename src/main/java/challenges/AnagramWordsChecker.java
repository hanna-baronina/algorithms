package challenges;

import java.util.HashMap;
import java.util.Map;

public class AnagramWordsChecker {

    public static boolean isAnagramWords(String word1, String word2) {
        if (word1.length() == 0 || word2.length() == 0) {
            return false;
        }
        Map<Character, Integer> characters = new HashMap<>();

        char[] firstWordCharacters = word1.toCharArray();

        for (char firstWordCharacter : firstWordCharacters) {
            if (characters.containsKey(firstWordCharacter)) {
                int count = characters.get(firstWordCharacter);
                characters.put(firstWordCharacter, count + 1);
            } else {
                characters.put(firstWordCharacter, 1);
            }
        }

        char[] secondWordCharacters = word2.toCharArray();
        for (char secondWordCharacter : secondWordCharacters) {
            if (characters.containsKey(secondWordCharacter)) {
                if (characters.get(secondWordCharacter) > 1) {
                    int count = characters.get(secondWordCharacter);
                    characters.put(secondWordCharacter, count - 1);
                } else {
                    characters.remove(secondWordCharacter);
                }
            }
        }
        return characters.isEmpty();
    }
}
