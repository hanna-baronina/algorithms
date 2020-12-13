package challenges;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDigitsPrinter2 {

    public static Set<Integer> findDuplicateValues(int[] array) {
        Set<Integer> visitedValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        for (int number : array) {
            if (!visitedValues.contains(number)) {
                visitedValues.add(number);
            } else {
                if (!duplicateValues.contains(number)) {
                    duplicateValues.add(number);
                }
            }
        }
        return duplicateValues;
    }
}
