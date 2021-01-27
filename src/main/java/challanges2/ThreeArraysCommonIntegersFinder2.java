package challanges2;

import java.util.ArrayList;
import java.util.List;

public class ThreeArraysCommonIntegersFinder2 {
    public static Integer[] getCommonIntegers(int[] array1, int[] array2, int[] array3) {
        int index1 = 0, index2 = 0, index3 = 0;
        List<Integer> commonDigits = new ArrayList<>();

        while (index1 < array1.length && index2 < array2.length && index3 < array3.length) {
            if (array1[index1] == array2[index2] && array2[index2] == array3[index3]) {
                commonDigits.add(array1[index1]);
                index1++;
                index2++;
                index3++;
            } else if (array1[index1] < array2[index2]) {
                index1++;
            } else if (array2[index2] < array3[index3]) {
                index2++;
            } else {
                index3++;
            }
        }
        return commonDigits.toArray(new Integer[0]);
    }
}
