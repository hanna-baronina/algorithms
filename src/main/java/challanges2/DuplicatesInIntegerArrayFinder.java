package challanges2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInIntegerArrayFinder {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 4, 3, 1, 5, 4, 4, 5};
        System.out.println(Arrays.toString(getDuplicates(array)));
    }

    public static Integer[] getDuplicates(int[] array) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!duplicates.contains(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplicates.add(array[i]);
                        break;
                    }
                }
            }
        }
        return duplicates.toArray(new Integer[0]);
    }
}
