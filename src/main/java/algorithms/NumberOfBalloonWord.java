package algorithms;

import java.util.HashSet;
import java.util.Set;

public class NumberOfBalloonWord {
    public static void main(String[] args) {
        String string = "ppbaloonbaoon";
        int count = 0;
        Set<Integer> foundLetterIndexes = new HashSet<Integer>();

        while (hasBalloon(string, foundLetterIndexes)) {
            count++;
        }
        System.out.println(count);
    }

    private static boolean hasBalloon(String string, Set<Integer> foundLetterIndexes) {
        String balloon = "balloon";
        boolean hasBalloon = true;
        for (int i = 0; i < balloon.length(); i++) {
            boolean hasLetter = hasLetter(balloon.charAt(i), foundLetterIndexes, string);
            if (!hasLetter) {
                hasBalloon = false;
                break;
            }
        }
        return hasBalloon;
    }

    private static boolean hasLetter(char letter, Set<Integer> foundLetterIndexes, String string) {
        for (int j = 0; j < string.length(); j++) {
            if (letter == string.charAt(j)) {
                if (foundLetterIndexes.contains(j)) {
                    continue;
                } else {
                    foundLetterIndexes.add(j);
                    return true;
                }
            }
        }
        return false;
    }
}
