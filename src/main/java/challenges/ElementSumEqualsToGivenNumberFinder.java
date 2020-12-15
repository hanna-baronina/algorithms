package challenges;

import java.util.HashMap;
import java.util.Map;


public class ElementSumEqualsToGivenNumberFinder {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 8, 4, 4};
        int number = 6;
        getNumbers(number, array);
    }

    public static void getNumbers(int number, int[] array) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int searchedNumber = number - array[i];
            if (!numbers.containsKey(searchedNumber)) {
                numbers.put(array[i], i);
            } else {
                System.out.println(array[i] + ":" + searchedNumber);
            }
        }
    }
}
