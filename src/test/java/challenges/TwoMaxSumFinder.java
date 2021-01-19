package challenges;

public class TwoMaxSumFinder {
    public static void main(String[] args){
        int[] array = {2, 3, 5, 7, -7, 5, 8, -5 };
        System.out.println(getMaxSum(array));

    }

    public static int getMaxSum(int[] array){
        int maxSum = 0;
      for(int i = 0; i < array.length; i++){
          for(int j = i + 1; j < array.length; j++){
              if(array[i] * array[j] > maxSum){
                  maxSum = array[i] * array[j];
              }
          }
      }
      return maxSum;
    }
}
