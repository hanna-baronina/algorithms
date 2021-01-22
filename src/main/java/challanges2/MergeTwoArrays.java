package challanges2;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 10, 13};
        int[] array2 = {1, 4, 6, 8, 9};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int firstIndex = 0;
        int secondIndex = 0;
        int[] array3 = new int[array1.length + array2.length];
        int writeIndex = 0;
        while (firstIndex < array1.length || secondIndex < array2.length) {
            if (firstIndex < array1.length && secondIndex < array2.length) {
                if (array1[firstIndex] <= array2[secondIndex]) {
                    array3[writeIndex] = array1[firstIndex];
                    writeIndex++;
                    firstIndex++;
                } else {
                    array3[writeIndex] = array2[secondIndex];
                    writeIndex++;
                    secondIndex++;
                }
            } else if (firstIndex == array1.length) {
                array3[writeIndex] = array2[secondIndex];
                writeIndex++;
                secondIndex++;
            } else {
                array3[writeIndex] = array1[firstIndex];
                writeIndex++;
                firstIndex++;
            }
        }
        return array3;
    }
}
