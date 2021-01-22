package challanges2;

public class TwoConsecutiveMaxSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 5, -5, 7};
        System.out.println(getTwoConsecutiveElementsWithMaxSum(array));
    }

    public static int getTwoConsecutiveElementsWithMaxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + array[i + 1] > maxSum) {
                maxSum = array[i] + array[i + 1];
            }
        }
        return maxSum;
    }
}
