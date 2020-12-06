package challenges;

public class StringRecursiveReverser {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(reverseString(word));
    }


    public static String reverseString(String word) {
        if (word.length() == 1){
            return word;
        }

        char letter = word.charAt(0);
        word = word.substring(1);
        return reverseString(word) + letter;
    }
}
