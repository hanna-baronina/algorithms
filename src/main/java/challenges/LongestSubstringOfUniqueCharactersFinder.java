package challenges;


public class LongestSubstringOfUniqueCharactersFinder {

    public static String findLongestSubstring(String word) {
        int startIndex = 0;
        int nextElementIndex = 0;
        String longestString = "";

        while (nextElementIndex < word.length()) {
            String currentSubstring = word.substring(startIndex, nextElementIndex);
            String nextLetter = String.valueOf(word.charAt(nextElementIndex));

            if (!currentSubstring.contains(nextLetter)) {
                nextElementIndex++;
                String newCurrentSubstring = word.substring(startIndex, nextElementIndex);
                if (newCurrentSubstring.length() > longestString.length()){
                    longestString = newCurrentSubstring;
                }
            } else {
                startIndex++;
            }
        }
        return longestString;
    }

}
