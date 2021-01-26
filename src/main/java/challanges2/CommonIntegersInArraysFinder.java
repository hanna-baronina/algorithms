package challanges2;

import java.util.*;

public class CommonIntegersInArraysFinder {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 3, 4, 2};
        int[] array2 = {1, 8, 3, 2, 5};
        System.out.println(Arrays.toString(getCommonIntegers(array1, array2)));
    }

    public static Integer[] getCommonIntegers(int[] array1, int[] array2) {
        Set<Integer> array1Digits = new HashSet<>();
        for (int digit : array1) {
            array1Digits.add(digit);
        }

        List<Integer> commonIntegers = new ArrayList<>();
        for (int digit : array2) {
            if (array1Digits.contains(digit)) {
                commonIntegers.add(digit);
                System.out.println(digit);
            }
        }
        return commonIntegers.toArray(new Integer[0]);
    }
}
