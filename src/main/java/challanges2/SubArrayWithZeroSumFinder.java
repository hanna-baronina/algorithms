package challanges2;

import java.util.Arrays;

public class SubArrayWithZeroSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, -4, 2, 3, -2, -3};
        System.out.println(hasSubArrayWithZeroSum(array));
        printAllSubArraysWithZeroSum(array);
    }

    public static boolean hasSubArrayWithZeroSum(int[] array) {
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j <= array.length - i; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum = array[k] + sum;
                }
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printAllSubArraysWithZeroSum(int[] array) {
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j <= array.length - i; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum = array[k] + sum;
                }

                if (sum == 0) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(array, j, j + i)));
                }
            }
        }
    }
}
