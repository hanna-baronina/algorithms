package challanges2;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDuplicatesPrinter {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 3, 4, 5, 2};
        countNumberOfDuplicates(array);
    }

    public static void countNumberOfDuplicates(int[] array) {
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
        for (Map.Entry<Integer, Integer> entry : digitsCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
