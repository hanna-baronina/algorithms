package challanges2;

import java.util.Arrays;

public class SecondLargestElementFinder {
    public static int getSecondLargest(int[] array) {
        Arrays.sort(array);
        if (array.length == 0 || array.length == 1) {
            return -1;
        }
        int maxElement = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                secondMax = maxElement;
                maxElement = array[i];
            }
        }
        return secondMax;
    }
}
