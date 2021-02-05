package challanges2;

public class LongestSubstringWithoutRepeatingCharsFinder2 {
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        System.out.println(getLongestNonRepeatingSubstring(str));
    }

    public static int getLongestNonRepeatingSubstring(String str) {
        char[] characters = str.toCharArray();
        int startIndex = 0;
        int maxLength = 0;
        int verifier;

        for (int invest = 0; invest < characters.length; invest++) {
            boolean hasDuplicate;
            do {
                hasDuplicate = false;
                for (verifier = startIndex; verifier < invest; verifier++) {
                    if (characters[invest] == characters[verifier]) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (hasDuplicate) {
                    startIndex++;
                }

            } while (hasDuplicate);

            int length = invest - startIndex + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
