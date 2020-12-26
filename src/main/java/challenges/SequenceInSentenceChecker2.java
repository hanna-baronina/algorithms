package challenges;

public class SequenceInSentenceChecker2 {
    public static boolean checkPresenceOfSequenceInSentence(String sentence, String word){
        char[] sentenceCharacters = sentence.toLowerCase().toCharArray();
        char[] wordCharacters = word.toLowerCase().toCharArray();

        for (int i = 0; i < sentenceCharacters.length - (word.length() - 1); i++){
            if(sentenceCharacters[i] == wordCharacters[0]) {
                boolean hasLetter = true;
                for (int j = 0; j < wordCharacters.length; j++) {
                    if (wordCharacters[j] != sentenceCharacters[j + i]) {
                        hasLetter = false;
                        break;
                    }
                }
                if (hasLetter){
                  return true;
                }
            }
        }
        return false;
    }
}
