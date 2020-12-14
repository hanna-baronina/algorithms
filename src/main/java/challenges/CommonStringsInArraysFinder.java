package challenges;

import java.util.HashSet;
import java.util.Set;

public class CommonStringsInArraysFinder {
    public static Set<String> findCommonStringInArrays(String[] array1, String[] array2) {
        Set<String> commonElements = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    commonElements.add(array1[i]);
                    break;
                }
            }
        }
        return commonElements;
    }
}
