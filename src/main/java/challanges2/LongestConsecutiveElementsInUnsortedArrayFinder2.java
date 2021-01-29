package challanges2;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveElementsInUnsortedArrayFinder2 {
    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 71, 72, 73, 74, 75, 76};
        System.out.println(getMaxConsecutiveLength(array));
    }

    public static int getMaxConsecutiveLength(int[] array) {
        Set<Integer> digits = new HashSet<>();
        for (int digit : array) {
            digits.add(digit);
        }
        int maxLength = 0;
        for (int digit : array) {
            int currentLength = 1;
            int localDigit = digit;
            int localDigit2 = digit;
            while (digits.contains(localDigit + 1)) {
                currentLength++;
                localDigit++;
            }
            while (digits.contains(localDigit2 - 1)) {
                currentLength++;
                localDigit2--;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
