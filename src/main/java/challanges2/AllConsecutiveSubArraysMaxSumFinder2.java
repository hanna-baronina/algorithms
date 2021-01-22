package challanges2;

public class AllConsecutiveSubArraysMaxSumFinder2 {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -1, 5};
        System.out.println(getSubArrayWithMaxSum(array));
    }

    public static int getSubArrayWithMaxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int number : array) {
            if (currentSum + number < number) {
                currentSum = number;
            } else {
                currentSum = currentSum + number;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
