package challenges;

import java.util.Arrays;

public class ArrayLengthWithoutDuplicatesFinder {
    public static void main(String[] args) {
        int[] array = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(ArrayLengthWithoutDuplicatesFinder.getUniqueElementsArrayLength(array));
    }

    public static int getUniqueElementsArrayLength(int[] array) {
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
        return Arrays.copyOf(array, writeIndex).length;
    }
}
