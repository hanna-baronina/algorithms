package challanges2;

import java.util.Arrays;

public class TwoSortedArraysBalancer {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 7, 8, 10};
        int[] array2 = {2, 4, 9};
        balanceArrays(array1, array2);
    }

    public static void balanceArrays(int[] array1, int[] array2) {
        int index1 = 0;
        int index2 = 0;


        int[] array3 = new int[array1.length + array2.length];
        int writeIndex = 0;

        while (index1 < array1.length || index2 < array2.length) {
            if (index1 < array1.length && index2 < array2.length) {
                if (array1[index1] <= array2[index2]) {
                    array3[writeIndex] = array1[index1];
                    writeIndex++;
                    index1++;
                } else {
                    array3[writeIndex] = array2[index2];
                    writeIndex++;
                    index2++;
                }
            } else if (index1 > array1.length - 1) {
                array3[writeIndex] = array2[index2];
                writeIndex++;
                index2++;
            } else {
                array3[writeIndex] = array1[index1];
                writeIndex++;
                index1++;
            }
        }

        int[] resultArray1 = new int[array1.length];
        int[] resultArray2 = new int[array2.length];
        int count = 0;
        System.out.println(Arrays.toString(array3));

        for (int i = 0; i < array3.length; i++) {
            if (i <= resultArray1.length - 1) {
                resultArray1[i] = array3[i];
            } else {
                resultArray2[count] = array3[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(resultArray1));
        System.out.println(Arrays.toString(resultArray2));
    }

}
