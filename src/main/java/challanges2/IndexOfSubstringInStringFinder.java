package challanges2;

public class IndexOfSubstringInStringFinder {
    public static void main(String[] args) {
        String word = "abcabcd";
        String subString = "cd";
        System.out.println(getIndexOfSubstring(word, subString));
    }

    public static int getIndexOfSubstring(String word, String subString) {
        char[] subStringChars = subString.toCharArray();
        char[] wordChars = word.toCharArray();

        for (int i = 0; i < wordChars.length - subString.length() + 1; i++) {
            boolean hasWord = true;
            for (int j = i; j < i + subStringChars.length; j++) {
                if (wordChars[j] != subStringChars[j - i]) {
                    hasWord = false;
                    break;
                }
            }
            if (hasWord){
                return i;
            }
        }
        return -1;
    }
}