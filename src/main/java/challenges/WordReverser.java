package challenges;

public class WordReverser {
    public static void main(String[] args) {
        String sentence = "This is a test string";
        System.out.println(reverseWord(sentence));

    }

    public static String reverseWord(String sentence) {
        String[] wordsArray = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            char[] wordCharacters = word.toCharArray();

            for (int i = wordCharacters.length - 1; i >= 0; i--) {
                sb.append(wordCharacters[i]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
