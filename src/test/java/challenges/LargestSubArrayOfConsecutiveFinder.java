package challenges;

import java.util.Arrays;

public class LargestSubArrayOfConsecutiveFinder {
    public static void main (String[] args){
        int[] array = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};
        getLargest(array);
    }
    public static void getLargest(int[] array){
        for(int arraySize = array.length; arraySize >=2; arraySize--){
            for(int firstElement = 0; firstElement <= array.length - arraySize; firstElement++){
                int[] array2 = Arrays.copyOfRange(array, firstElement, firstElement + arraySize);
                if(isConsecutive(array2)){
                    System.out.println(Arrays.toString(array2));
                    return;
                }

            }
        }
    }

    public static boolean isConsecutive(int[] array){
        int[] array2 = Arrays.copyOf(array,array.length);
        Arrays.sort(array2);
        for(int i = 1; i < array2.length; i++){
            if(array2[i] != array2[i-1] + 1){
                return false;
            }
        }
        return true;
    }
}
