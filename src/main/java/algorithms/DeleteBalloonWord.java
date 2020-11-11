package algorithms;

import java.util.HashSet;
import java.util.Set;

public class DeleteBalloonWord {
    public static void main(String[] args) {
        String sentence = "bllaplwwlloqonq";
        while (hasBalloon(sentence)) {
            sentence = deleteBalloon(sentence);
        }
        System.out.println(sentence);
    }

    private static boolean hasBalloon(String sentence) {
        Set<Integer> letterFoundIndex = new HashSet<Integer>();
        String word = "balloon";
        boolean hasBalloon = true;
        for (int i = 0; i < word.length(); i++) {
            if (!hasLetter(sentence, word.charAt(i), letterFoundIndex)) {
                hasBalloon = false;
            }
        }
        return hasBalloon;
    }

    private static boolean hasLetter(String sentence, char letter, Set<Integer> letterFoundIndex) {
        for (int j = 0; j < sentence.length(); j++) {
            if (letter == sentence.charAt(j)) {
                if (letterFoundIndex.contains(j)) {
                    continue;
                } else {
                    letterFoundIndex.add(j);
                    return true;
                }
            }
        }
        return false;
    }

    private static String deleteBalloon(String sentence) {
        String word = "balloon";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (word.charAt(i) == sentence.charAt(j)) {
                    sentence = sentence.substring(0, j) + sentence.substring(j + 1);
                    break;
                }
            }
        }
        return sentence;
    }
}
