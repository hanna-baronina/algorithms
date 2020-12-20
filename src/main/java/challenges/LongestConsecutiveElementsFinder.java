package challenges;

import java.util.Arrays;

public class LongestConsecutiveElementsFinder {
    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        int[] array2 = {7, 1, 3, 8, 2, 4, 9, 5, 10, 11, 12, 13, 14};
        System.out.println(getMaxLength(array2));
    }

    public static int getMaxLength(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int maxCount = 1;
        int count = 1;

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] + 1 == array[index + 1]) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}
