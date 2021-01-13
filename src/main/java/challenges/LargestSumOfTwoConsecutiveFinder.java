package challenges;

public class LargestSumOfTwoConsecutiveFinder {
    public static void main (String[] args){
        int[] array = {10,2,3,1,15,15};
        System.out.println(getLargestSum(array));

    }

    public static int getLargestSum(int[] array){
        int maxSum = 0;
        for(int i = 0; i < array.length - 1; i++){
            int sum = array[i] + array[i+1];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
