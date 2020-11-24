package algorithms2;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main (String [] args){
        int[] array1 = {1,3,4,7,9};
        int[] array2 = {2,3,5,6,11};
        int[] array3 = new int [array1.length + array2.length];

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int writeIndex = 0;

        while(firstArrayIndex != array1.length || secondArrayIndex != array2.length ){
            if(firstArrayIndex == array1.length){
                array3[writeIndex] = array2[secondArrayIndex];
                writeIndex++;
                secondArrayIndex++;
            } else if (secondArrayIndex == array2.length){
                array3[writeIndex] = array1[firstArrayIndex];
                writeIndex++;
                firstArrayIndex++;
            } else if (array1[firstArrayIndex] <= array2[secondArrayIndex]){
                array3[writeIndex] = array1[firstArrayIndex];
                writeIndex++;
                firstArrayIndex++;
            } else {
                array3[writeIndex] = array2[secondArrayIndex];
                writeIndex++;
                secondArrayIndex++;
            }
        }

        System.out.println(Arrays.toString(array3));
    }
}
