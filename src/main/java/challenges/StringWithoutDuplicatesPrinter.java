package challenges;


public class StringWithoutDuplicatesPrinter {
    public static void main(String[] args) {
        String word = "balloon";
        System.out.println(removeDuplicateLettersFromWord(word));
    }

    public static String removeDuplicateLettersFromWord(String word) {
        String stringNew = "";

        char[] wordCharacters = word.toCharArray();
        for (char character : wordCharacters) {
            if (stringNew.indexOf(character) == -1) {
                stringNew = stringNew + character;
            }
        }
        return stringNew;
    }
}
