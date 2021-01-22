package challanges2;

import java.util.Arrays;

public class ZerosToTheEndMover {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 5, 0, 8, 9};
        System.out.println(Arrays.toString(moveNullsToTheEnd(array)));
    }

    public static int[] moveNullsToTheEnd(int[] array) {
        int writeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }
        for (int j = writeIndex; j < array.length; j++) {
            array[j] = 0;
        }
        return array;
    }
}
