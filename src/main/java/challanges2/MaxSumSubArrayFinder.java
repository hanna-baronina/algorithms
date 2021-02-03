package challanges2;

public class MaxSumSubArrayFinder {

    public static void main(String[] args) {
        int[] array = {1, 2, -3, -4, 0, 6, 7, 8, 9};
        System.out.println(getSubArrayWithMaxSum(array));
    }

    public static int getSubArrayWithMaxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int globalMaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (maxSum + array[i] > array[i]) {
                maxSum = maxSum + array[i];
                if (maxSum > globalMaxSum) {
                    globalMaxSum = maxSum;
                }
            } else {
                maxSum = array[i];
            }
        }
        return globalMaxSum;

    }
}
