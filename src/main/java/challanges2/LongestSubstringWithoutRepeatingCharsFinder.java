package challanges2;

public class LongestSubstringWithoutRepeatingCharsFinder {
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        System.out.println(getLongestNonRepeatingSubstring(str));
    }

    public static int getLongestNonRepeatingSubstring(String str) {
        char[] characters = str.toCharArray();

        int startIndex = 0;
        int maxLength = 0;

        for (int invest = 0; invest < characters.length; invest++) {
            while (hasDuplicate(startIndex, invest, characters)) {
                startIndex++;
            }

            int length = invest - startIndex + 1;
            if (maxLength < length) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static boolean hasDuplicate(int start, int invest, char[] characters) {
        boolean hasDuplicate = false;
        for (int verify = start; verify < invest; verify++) {
            if (characters[invest] == characters[verify]) {
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}