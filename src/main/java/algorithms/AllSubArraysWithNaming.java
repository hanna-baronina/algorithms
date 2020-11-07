package algorithms;

import java.util.Arrays;

public class AllSubArraysWithNaming {
    public static void main (String [] args){
        int[] array = {1, 2, 3, 4};

        for (int subArrayLength = 1; subArrayLength <= array.length; subArrayLength++) {
            for (int firstElementOfSubArray = 0; firstElementOfSubArray < array.length - (subArrayLength - 1); firstElementOfSubArray++) {
                int[] subArray = new int[subArrayLength];
                for (int currentElementOfSubArray = 0; currentElementOfSubArray < subArray.length; currentElementOfSubArray++) {
                    subArray[currentElementOfSubArray] = array[firstElementOfSubArray + currentElementOfSubArray];
                }
                System.out.println(Arrays.toString(subArray));
            }
        }
    }
}
