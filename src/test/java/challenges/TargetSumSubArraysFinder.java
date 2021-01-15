package challenges;

import java.util.Arrays;

public class TargetSumSubArraysFinder {
    public static void main (String[] args){
        int[] array = {1, 2, -3};
        getSubArrayWithTargetSum(array);
    }

    public static void getSubArrayWithTargetSum(int[] array){
        for(int i = 1; i <= array.length; i++){
            for(int j = 0; j <= array.length - i; j++){
                int sum = 0;
                for(int k = j; k < j + i; k++){
                    sum +=array[k];
                }
                if(sum == 0){
                    System.out.println(Arrays.toString(Arrays.copyOfRange(array, j, j+i)));
                }
            }
        }
    }
}
