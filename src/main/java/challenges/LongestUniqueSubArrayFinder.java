package challenges;

public class LongestUniqueSubArrayFinder {
    public static void main(String[] args) {
        int[] array = {2, 7, 3, 4, 7, 9, 2, 6, 3};
        System.out.println(getLongestUniqueSubArray(array));
    }

    public static int getLongestUniqueSubArray(int[] array) {
        int startIndex = 0;
        int investigatorIndex = 1;
        int maxLength = 1;
        while (investigatorIndex < array.length) {
            if (hasDuplicate(startIndex, investigatorIndex, array)) {
                startIndex++;
            } else {
                int length = investigatorIndex - startIndex + 1;
                if (length > maxLength) {
                    maxLength = length;
                }
                investigatorIndex++;
            }
        }
        return maxLength;
    }

    public static boolean hasDuplicate(int startIndex, int investigatorIndex, int[] array) {
        for (int i = startIndex; i < investigatorIndex; i++) {
            if (array[i] == array[investigatorIndex]) {
                return true;
            }
        }
        return false;
    }
}

