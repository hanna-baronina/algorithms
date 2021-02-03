package challanges2;

import java.util.Arrays;

public class TwoSortedArraysBalancer2 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 7, 8, 10};
        int[] array2 = {2, 4, 9};
        balanceArrays(array1, array2);
    }

    public static void balanceArrays(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > array2[0]) {
                int temp = array2[0];
                array2[0] = array1[i];
                array1[i] = temp;
            }
            for (int j = 0; j < array2.length - 1; j++) {
                if (array2[j] > array2[j + 1]) {
                    int temp2 = array2[j + 1];
                    array2[j + 1] = array2[j];
                    array2[j] = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
