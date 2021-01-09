package challenges;

import java.util.Arrays;

public class NSubsetReverser {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 4, 3, 2, 3, 5};
        int nLength = 5;
        System.out.println(Arrays.toString(reverseNgthSubArray(array, nLength)));
        System.out.println(Arrays.toString(reverseNgthSubArray2(array, nLength)));
    }

    public static int[] reverseNgthSubArray(int[] array, int nLength) {
        int[] resultArray = new int[array.length];
        int writeIndex = 0;
        for (int i = 0; i < array.length; i += nLength) {
            for (int j = i + nLength - 1; j >= i; j--) {
                if (j < array.length) {
                    resultArray[writeIndex] = array[j];
                    writeIndex++;
                }
            }
        }
        return resultArray;
    }

    public static int[] reverseNgthSubArray2(int[] array, int nLength) {
        for (int i = 0; i < array.length; i += nLength) {
            int startIndex = i;
            int endIndex = (i + nLength) -1;
            if(endIndex > array.length - 1){
                endIndex = array.length - 1;
            }
            while (startIndex < endIndex) {
                int temp = array[startIndex];
                array[startIndex] = array[endIndex];
                array[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
        return array;
    }
}
