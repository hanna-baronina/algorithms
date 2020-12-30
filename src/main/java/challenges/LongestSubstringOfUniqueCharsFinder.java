package challenges;

import java.util.Arrays;

public class LongestSubstringOfUniqueCharsFinder {
    public static char[] getLongestUniqueCharacters(String word) {
        char[] wordCharacters = word.toCharArray();
        int startIndex = 0;
        int maxLength = 0;
        char[] resultArray = new char[wordCharacters.length];
        for (int investIndex = 1; investIndex < word.length(); investIndex++) {
            while (hasDuplicate(startIndex, investIndex, wordCharacters)) {
                startIndex++;
            }
            int length = investIndex - startIndex + 1;
            if (length > maxLength) {
                maxLength = length;
                resultArray = Arrays.copyOfRange(wordCharacters, startIndex, investIndex + 1);
            }
        }
        return resultArray;
    }

    public static boolean hasDuplicate(int startIndex, int investIndex, char[] wordCharacters) {
        for (int i = startIndex; i < investIndex; i++) {
            if (wordCharacters[i] == wordCharacters[investIndex]) {
                return true;
            }
        }
        return false;
    }
}
