package challenges;

public class LongestPalindromeSubstring2 {
    public static int getMaxPalindromeLength(String word) {
        char[] wordLetters = word.toLowerCase().toCharArray();
        int maxLength = 0;
        for (int windowSize = 2; windowSize <= wordLetters.length; windowSize++) {
            for (int j = 0; j <= wordLetters.length - windowSize; j++) {
                boolean result = isPalindrome(wordLetters, j, j + windowSize - 1);
                if (result) {
                    if (windowSize > maxLength) {
                        maxLength = windowSize;
                    }
                }
            }
        }
        return maxLength;
    }

    public static boolean isPalindrome(char[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if (array[startIndex] == array[endIndex]) {
                startIndex++;
                endIndex--;
            } else {
                return false;
            }
        }
        return true;
    }
}
