package challenges;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubArrayFinder4 {

    public static int getLongest(int[] array) {
        int startIndex = 0;
        int maxLength = 1;
        Set<Integer> uniqueElements = new HashSet<>();
        uniqueElements.add(array[0]);

        for (int investIndex = 1; investIndex < array.length; investIndex++) {
            while (uniqueElements.contains(array[investIndex])) {
                uniqueElements.remove(array[startIndex]);
                startIndex++;
            }
            uniqueElements.add(array[investIndex]);
            if (uniqueElements.size() > maxLength) {
                maxLength = uniqueElements.size();
            }
        }
        return maxLength;
    }
}
