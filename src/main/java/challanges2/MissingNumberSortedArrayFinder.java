package challanges2;

public class MissingNumberSortedArrayFinder {

    public static int findMissingNumber(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i] - 1;
            }
        }
        return array[0] - 1;
    }
}
