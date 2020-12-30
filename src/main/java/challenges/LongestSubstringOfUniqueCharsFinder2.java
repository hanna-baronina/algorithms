package challenges;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringOfUniqueCharsFinder2 {
    public static int getLengthOfUniqueCharacters(String word) {
        char[] wordCharacters = word.toCharArray();
        int startIndex = 0;
        int maxLength = 0;

        Set<Character> uniqueCharacters = new HashSet<>();
        uniqueCharacters.add(wordCharacters[0]);

        for (int invest = 1; invest < wordCharacters.length; invest++) {
            while (uniqueCharacters.contains(wordCharacters[invest])) {
                uniqueCharacters.remove(wordCharacters[startIndex]);
                startIndex++;
            }
            uniqueCharacters.add(wordCharacters[invest]);
            int length = invest - startIndex + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
