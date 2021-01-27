package challanges2;

import java.util.HashSet;
import java.util.Set;

public class SecondLargestElementFinder2 {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 7, 5, 9};
        System.out.println(getSecondLargest(array));
    }

    public static int getSecondLargest(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return -1;
        }
        Set<Integer> digitsSet = new HashSet<>();
        for (int digit : array) {
            digitsSet.add(digit);
        }
        Integer[] arrayWithoutDuplicates = digitsSet.toArray(new Integer[0]);

        for (int i = 0; i < array.length - 1 - i; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        return arrayWithoutDuplicates[arrayWithoutDuplicates.length - 2];
    }
}
