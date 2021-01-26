package challanges2;

import java.util.Arrays;

public class IndexOfArrayElementSortedArrayFinder {
    public static void main(String[] args) {
        int number = 6;
        int[] array = {23, 19, 3, 4, 6, 10, 15, 2};
        System.out.println(getIndexOfNumber(array, number));
    }

    public static int getIndexOfNumber(int[] array, int number) {
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 6));
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            // int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == number) {
                return middleIndex;
            } else if (array[middleIndex] < number) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
