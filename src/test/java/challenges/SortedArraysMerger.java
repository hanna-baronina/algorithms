package challenges;

import java.util.Arrays;

public class SortedArraysMerger {
    public static void main (String[]args) {
        int[] array1 = {1,3,5,6};
        int[] array2 = {2,2,7,8,9};
        System.out.println(Arrays.toString(mergeSortedArrays(array1,array2)));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2){
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int writeIndex = 0;
        int[] resultArray = new int[array1.length + array2.length];

        while(firstArrayIndex < array1.length || secondArrayIndex < array2.length){
            if(firstArrayIndex < array1.length && secondArrayIndex < array2.length){
                 if(array1[firstArrayIndex] <= array2[secondArrayIndex]){
                     resultArray[writeIndex] = array1[firstArrayIndex];
                     firstArrayIndex++;
                     writeIndex++;
                 } else {
                     resultArray[writeIndex] = array2[secondArrayIndex];
                     secondArrayIndex++;
                     writeIndex++;
                 }
            } else if (firstArrayIndex == array1.length){
                resultArray[writeIndex] = array2[secondArrayIndex];
                secondArrayIndex++;
                writeIndex++;
            } else {
                resultArray[writeIndex] = array1[firstArrayIndex];
                firstArrayIndex++;
                writeIndex++;
            }
        }
        return resultArray;
    }
}
