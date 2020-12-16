package challenges;

import java.util.Arrays;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array = {1,6,4,5,2};
        System.out.println(findMissingNumber(array));
        System.out.println(findMissingNumber2(array));
    }

    public static int findMissingNumber(int[] array){
        Arrays.sort(array);
        for(int i  = 0; i < array.length; i++){
            if(array[i] != i+1){
                return i+1;
            }
        }
        return  array.length +1;
    }

    public static int findMissingNumber2(int[] array){
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        for (int j = 1; j <= array.length + 1; j++){
            sum2 = sum2 + j;
        }
        return sum2 - sum;
    }
}
