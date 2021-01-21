package challanges2;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class AllConsecutiveSubArraysMaxSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -1, 5};
        System.out.println(getMaxSumSubArray(array));
    }

    public static int getMaxSumSubArray(int[] array) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j <= array.length - i; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum = sum + array[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                        System.out.println(Arrays.toString(copyOfRange(array, j, (j + i))));
                    }
                }
            }
        }
        return maxSum;
    }
}
