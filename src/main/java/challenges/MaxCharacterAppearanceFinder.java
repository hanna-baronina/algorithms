package challenges;

public class MaxCharacterAppearanceFinder {
    public static char getMaxAppearanceChar(String word) {
        char[] wordCharacters = word.toCharArray();
        int[] lettersCount = new int[26];
        int max = 0;
        int maxIndex = 0;
        for (char character : wordCharacters) {
            int position = character - 'a';
            if (position >= 0 && position < 26) {
                lettersCount[position]++;
                if (lettersCount[position] > max) {
                    max = lettersCount[position];
                    maxIndex = position;
                }
            }
        }
        return (char) ('a' + maxIndex);
    }
}
