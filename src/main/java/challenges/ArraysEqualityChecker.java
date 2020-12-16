package challenges;

public class ArraysEqualityChecker {
    public static boolean isArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int startIndex1 = 0;
        int startIndex2 = 0;
        boolean isEqual = true;

        while (startIndex1 < array1.length) {
            if (array1[startIndex1] == array2[startIndex2]) {
                startIndex1++;
                startIndex2++;
            } else {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
}
