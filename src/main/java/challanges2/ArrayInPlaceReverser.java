package challanges2;

import java.util.Arrays;

public class ArrayInPlaceReverser {
    public static void main (String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseInPlace(array)));
    }

    public static int[] reverseInPlace(int[] array){
        int startIndex = 0;
        int endIndex = array.length -1;

        while (startIndex < endIndex) {
            int temp = array[endIndex];
            array[endIndex] = array[startIndex];
            array[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return array;
    }
}
