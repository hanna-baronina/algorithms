package challanges2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArrayFinder {
    public static void main(String[] args) {
        int[] array = {10, 15, 4, 5, 22, 24};
        System.out.println(findLongestSubArrayWithConsecutive(array));
    }

    public static int findLongestSubArrayWithConsecutive(int[] array) {
        for (int i = array.length; i >= 2; i--) {
            for (int j = 0; j <= array.length - i; j++) {
                if (hasAllConsecutive(Arrays.copyOfRange(array, j, j + i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean hasAllConsecutive(int[] array) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : array) {
            if (numbers.contains(number)) {
                return false;
            } else {
                numbers.add(number);
            }
        }
        int startIncrease = array[0];
        while (numbers.contains(startIncrease)) {
            numbers.remove(startIncrease);
            startIncrease++;
        }

        int startDecrease = array[0] - 1;
        while (numbers.contains(startDecrease)) {
            numbers.remove(startDecrease);
            startDecrease--;
        }
        return numbers.isEmpty();
    }
}
