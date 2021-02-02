package challanges2;

import java.util.Arrays;

public class TripletsMaxSumFinder2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, -3, 4};
        System.out.println(getMaxTripletsSum(array));
    }

    public static int getMaxTripletsSum(int[] array) {
        Arrays.sort(array);
        int maxSum = 0;
        for (int i = array.length - 1; i >= array.length - 3; i--) {
            maxSum = array[i] + maxSum;
        }
        return maxSum;
    }
}
