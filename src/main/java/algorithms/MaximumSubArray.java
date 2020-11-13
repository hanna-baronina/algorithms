package algorithms;

public class MaximumSubArray {
    public static void main(String[] args){
      int[] array = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
      int sum = array[0];
      int maxSum = array[0];
      for(int i = 0; i < array.length; i ++){
          if(sum + array[i] <  array[i]){
              sum = array[i];
          } else {
              sum = sum + array[i];
          }
          if(maxSum < sum){
              maxSum = sum;
          }
      }
      System.out.println(maxSum);
    }
}
