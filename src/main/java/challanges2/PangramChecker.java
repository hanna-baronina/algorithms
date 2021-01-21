package challanges2;

import java.util.Arrays;

public class PangramChecker {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangramSentence(sentence));
    }

    public static boolean isPangramSentence(String sentence) {
        int[] lettersCount = new int[26];
        for (char letter : sentence.toLowerCase().toCharArray()) {
            if (letter != ' ') {
                int position = letter - 'a';
                lettersCount[position]++;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < lettersCount.length; i++) {
            if (lettersCount[i] == 0) {
                isPangram = false;
                break;
            }
        }
        return isPangram;
    }
}
