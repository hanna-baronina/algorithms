package challenges;

import java.util.HashSet;
import java.util.Set;

public class StringForUniqueCharactersChecker {
    public static void main(String[] args) {
        String word = "xyzabcd";
        System.out.println(hasOnlyUniqueCharacters(word));
        System.out.println(hasOnlyUniqueCharacters2(word));

    }

    public static boolean hasOnlyUniqueCharacters(String word) {
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (word.indexOf(characters[i], i + 1) != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasOnlyUniqueCharacters2(String word) {
        Set<Character> characters = new HashSet<>();
        for (char letter : word.toCharArray()) {
            if (characters.contains(letter)) {
                return false;

            } else {
                characters.add(letter);
            }
        }
        return true;
    }
}