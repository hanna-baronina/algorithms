package challenges;

public class FirstUniqueCharacterFinder {
    public static String findFirstUnique(String word) {

        for (int i = 0; i < word.length() - 1; i++) {
            String character = word.substring(i, i + 1);
            if (!word.substring(i + 1).contains(character)) {
                return character;
            }
        }
        return "";
    }
}
