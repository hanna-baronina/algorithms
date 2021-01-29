package challanges2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementFinder {
    public static int findMajorityElement(int[] array) {
        Map<Integer, Integer> digitsCount = new HashMap<>();
        for (int digit : array) {
            if (digitsCount.containsKey(digit)) {
                int count = digitsCount.get(digit);
                count++;
                digitsCount.put(digit, count);
            } else {
                digitsCount.put(digit, 1);
            }
        }

        int majorityNumber = (int)Math.ceil(array.length / 2);
        System.out.println(majorityNumber);
        if (majorityNumber < 2) {
            return -1;
        }

        for (Map.Entry<Integer, Integer> entry : digitsCount.entrySet()) {
            if (entry.getValue() == majorityNumber) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
