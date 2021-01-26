package challanges2;

public class StringInPlaceReverser {
    public static void main(String[] args) {
        String word = "apple";
        System.out.println(reverseStringInPlace(word));
    }

    public static String reverseStringInPlace(String word) {
        char[] letters = word.toCharArray();

        int startIndex = 0;
        int endIndex = letters.length - 1;

        while (startIndex < endIndex) {
            char temp = letters[endIndex];
            letters[endIndex] = letters[startIndex];
            letters[startIndex] = temp;
            startIndex++;
            endIndex--;
        }

        StringBuilder sb = new StringBuilder();
        for (char letter : letters) {
            sb.append(letter);
        }

        return sb.toString();
    }
}
