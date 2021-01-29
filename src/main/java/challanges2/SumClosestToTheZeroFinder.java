package challanges2;

import java.util.Arrays;

public class SumClosestToTheZeroFinder {
    public static void main(String[] args) {
        int[] array = {2, -2, 1, 0, -3};
        System.out.println(Arrays.toString(getSumClosestToZero(array)));
    }

    public static int[] getSumClosestToZero(int[] array) {
        int closestSum = Integer.MAX_VALUE;
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];

                int distance = Math.abs(sum);

                if (distance < closestSum) {
                    closestSum = distance;
                    firstNumber = array[i];
                    secondNumber = array[j];
                }
            }
        }
        return new int[]{firstNumber, secondNumber};
    }
}
