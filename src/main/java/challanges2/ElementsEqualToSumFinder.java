package challanges2;

import java.util.HashSet;
import java.util.Set;

public class ElementsEqualToSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 5, 6};
        int targetSum = 5;
        getAllPairsEqualToSum(array, targetSum);
    }

    public static void getAllPairsEqualToSum(int[] array, int targetSum) {
        Set<Integer> visitedDigits = new HashSet<>();

        for (int digit : array) {
            int secondDigit = targetSum - digit;

            if (visitedDigits.contains(secondDigit)) {
                System.out.println(digit + "," + secondDigit);
            } else {
                visitedDigits.add(digit);
            }
        }
    }
}
