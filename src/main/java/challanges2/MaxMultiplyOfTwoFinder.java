package challanges2;

public class MaxMultiplyOfTwoFinder {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println(maxSumFinder(array));
    }

    public static int maxSumFinder(int[] array) {
        int maxMultiplication = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] * array[j] > maxMultiplication) {
                    maxMultiplication = array[i] * array[j];
                }
            }
        }
        return maxMultiplication;
    }
}