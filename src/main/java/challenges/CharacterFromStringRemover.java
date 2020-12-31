package challenges;

public class CharacterFromStringRemover {
    public static String removeCharacters(String sentence, String characters) {
        for (int i = 0; i < characters.length(); i++) {
            int currentCharacterIndex = sentence.indexOf(characters.charAt(i));
            while (currentCharacterIndex != -1) {
                sentence = sentence.substring(0, currentCharacterIndex) + sentence.substring(currentCharacterIndex + 1);
                currentCharacterIndex = sentence.indexOf(characters.charAt(i));
            }
        }
        return sentence;
    }
}
