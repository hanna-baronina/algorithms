package challanges2;

import java.util.Arrays;

public class LongestConsecutiveElementsInUnsortedArrayFinder {
    public static int getLongestConsecutiveElements(int[] array) {
        Arrays.sort(array);
        int maxLength = 1;
        int startIndex = 0;
        for (int investigator = 1; investigator < array.length; investigator++) {
            if (array[investigator] == array[investigator - 1] + 1) {
                int currentLength = investigator - startIndex + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                startIndex = investigator;
            }
        }
        return maxLength;
    }
}

//int log(n) {
//    int result = 0;
//    while (n > 1) {
//        n = n/2;
//        result++;
//        }
//    result;
//}