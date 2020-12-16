package challenges;

import java.util.Arrays;

public class TwoArraysMerger {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(mergeTwoArrays(arr1,arr2)));
    }

    public static int[] mergeTwoArrays(int[]arr1, int[]arr2) {
        int index1 = 0;
        int index2 = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        int writeIndex = 0;

        while(index1 < arr1.length || index2 < arr2.length){
            if(index1 < arr1.length && index2 < arr2.length){
                if(arr1[index1] <= arr2[index2]){
                    arr3[writeIndex] = arr1[index1];
                    writeIndex++;
                    index1++;
                } else {
                    arr3[writeIndex] = arr2[index2];
                    writeIndex++;
                    index2++;
                }
            }
            if(index1 == arr1.length && index2 < arr2.length){
                arr3[writeIndex] = arr2[index2];
                writeIndex++;
                index2++;
            }
            if (index1 < arr1.length && index2 == arr2.length){
                arr3[writeIndex] = arr1[index1];
                writeIndex++;
                index1++;
            }
        }
        return arr3;
    }
}

