package challenges;

public class SequenceInSentenceChecker3 {
    public static boolean checkSequencePresent(String sentence, String word) {
        char[] sentenceCharacters = sentence.toLowerCase().toCharArray();
        char[] wordCharacters = word.toLowerCase().toCharArray();

        for (int i = 0; i < sentenceCharacters.length - (wordCharacters.length - 1); i++) {
            boolean hasLetter = true;
            for (int j = 0; j < wordCharacters.length; j++) {
                if (wordCharacters[j] != sentenceCharacters[j + i]) {
                    hasLetter = false;
                    break;
                }
            }

            if (hasLetter) {
                return true;
            }
        }
        return false;
    }
}

