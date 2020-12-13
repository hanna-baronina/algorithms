package challenges;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringsGetter {
    public static void main(String[] args) {
        String[] array = {"apple", "table", "orange", "apple", "apple"};
        System.out.println(getDuplicateStrings(array).toString());
    }

    public static Set<String> getDuplicateStrings(String[] array) {
        Set<String> visitedWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();
        for (String word : array) {
            if (!visitedWords.contains(word)) {
                visitedWords.add(word);
            } else {
                if (!duplicateWords.contains(word)) {
                    duplicateWords.add(word);
                }
            }
        }
        return duplicateWords;
    }
}