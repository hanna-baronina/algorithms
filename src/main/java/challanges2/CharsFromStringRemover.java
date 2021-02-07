package challanges2;


public class CharsFromStringRemover {
    public static void main(String[] args) {
        String str = "the quick brown fox";
        String toRemove = "queen";
        System.out.println(removeCharsFromString(str, toRemove));

    }

    public static String removeCharsFromString(String str, String toRemove) {
        char[] charsToRemove = toRemove.toCharArray();
        char[] strChars = str.toCharArray();
        int countFoundLetters =
                0;
        for (char character : charsToRemove) {
            boolean hasLetter = false;
            for (int i = 0; i < strChars.length; i++) {
                if (character == strChars[i]) {
                    countFoundLetters++;
                    strChars = removeLetter(strChars, i);

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < strChars.length - countFoundLetters; j++) {
            sb.append(strChars[j]);
        }
        return sb.toString();
    }

    public static char[] removeLetter(char[] strChars, int index) {

        for (int i = index + 1; i < strChars.length; i++) {
            strChars[i - 1] = strChars[i];
        }
        return strChars;
    }
}
