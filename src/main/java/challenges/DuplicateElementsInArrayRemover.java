package challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArrayRemover {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 2, 7, 9, 5};
        removeDuplicateElementsWithSet(array);
        System.out.println(Arrays.toString(removeDuplicateElements(array)));
    }

    public static void removeDuplicateElementsWithSet(int[] array) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            numbersSet.add(array[i]);
        }
        System.out.println(numbersSet.toString());
    }

    public static int[] removeDuplicateElements(int[] array) {
        int writeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicate = false;
            for (int j = 0; j < writeIndex; j++) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                }
            }
            if (!hasDuplicate) {
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }
        return Arrays.copyOf(array, writeIndex);
    }
}
