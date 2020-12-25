package challenges;

public class CharacterOnIndexFinder {
    public static char getCharacter(String sentence, int index) {
        if (index >= sentence.length()) {
            return ' ';
        }
        return sentence.charAt(index);
    }
}
