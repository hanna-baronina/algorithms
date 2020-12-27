package challenges;

public class AllSubArraysMaxSumFinder {
    public static void main(String[] args) {
        int[] array = {1,7,-3,4};
        System.out.println(getMaxSum(array));
    }

    public static int getMaxSum(int[] array){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 1; i <= array.length; i++){
            for(int j = 0; j <= array.length - i; j++){
                int sum = 0;
                for(int k = 0; k < i; k++){
                    sum = sum + array[k + j];
                }
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
