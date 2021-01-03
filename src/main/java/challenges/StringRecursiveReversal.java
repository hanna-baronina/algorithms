package challenges;

public class StringRecursiveReversal {
    static StringBuilder reverseString(String word) {
        if (word.length() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(word.charAt(0));
            return sb;
        }
        StringBuilder reversedSubstring = reverseString(word.substring(1));
        reversedSubstring.append(word.charAt(0));

        return reversedSubstring;
    }
}