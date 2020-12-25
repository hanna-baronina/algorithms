package challenges;

public class StringComparator {
    public static boolean compareStrings(String sentence1, String sentence2) {
        if (sentence1.length() != sentence2.length()) {
            return false;
        }
        char[] array1 = sentence1.toCharArray();
        char[] array2 = sentence2.toCharArray();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}

