package challenges;

public class SequenceInSentenceChecker {
    public static void main(String[] args) {
        String word = "exercises";
        String sentence = "PHP Exercises and Python Exercises";
        System.out.println(findSequenceInSentence(sentence, word));
    }

    public static boolean findSequenceInSentence(String sentence, String word) {
        char[] sentenceCharacters = sentence.toLowerCase().toCharArray();
        char[] wordCharacters = word.toCharArray();
        int firstLetter = findFirstLetter(wordCharacters[0], sentenceCharacters, 0);
        while (firstLetter != -1) {
            boolean hasLetter = true;
            for (int i = 0; i < wordCharacters.length; i++) {
                if (wordCharacters[i] != sentenceCharacters[i + firstLetter]) {
                    hasLetter = false;
                    break;
                }
            }
            if (!hasLetter) {
                firstLetter = findFirstLetter(wordCharacters[0], sentenceCharacters, firstLetter + 1);
            } else {
                return true;
            }
        }
        return false;
    }

    public static int findFirstLetter(char firstCharacter, char[] sentenceCharacters, int start) {
        int foundLetter = -1;
        for (int i = start; i < sentenceCharacters.length; i++) {
            if (sentenceCharacters[i] == firstCharacter) {
                foundLetter = i;
                break;
            }
        }
        return foundLetter;
    }
}
