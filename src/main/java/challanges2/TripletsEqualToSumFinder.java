package challanges2;

import java.util.HashSet;
import java.util.Set;

public class TripletsEqualToSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 0, 8, 4, 1, 7};
        int targetSum = 7;
        getTripletsEqualToSum(array, targetSum);
    }

    public static void getTripletsEqualToSum(int[] array, int targetSum) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : array) {
            numbers.add(number);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int thirdNumber = targetSum - (array[i] + array[i + 1]);
            if (numbers.contains(thirdNumber)) {
                System.out.println(array[i] + "," + array[i + 1] + "," + thirdNumber);
            }
        }
    }
}
