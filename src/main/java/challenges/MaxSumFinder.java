package challenges;

public class MaxSumFinder {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(getMaxSum(array));

    }

    public static int getMaxSum(int[] array) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentSum + array[i] >= array[i]) {
                currentSum = currentSum + array[i];
                maxSum = Math.max(currentSum, maxSum);
            } else {
                currentSum = array[i];
            }
        }
        return maxSum;
    }
}
