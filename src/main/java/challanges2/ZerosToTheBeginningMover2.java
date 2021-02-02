package challanges2;

import java.util.Arrays;

public class ZerosToTheBeginningMover2 {
    public static void main(String[] args) {
        int[] array = {3, 0, 4, 5, 6, 0, 0, 8, 0};
        System.out.println(Arrays.toString(moveZerosToTheBeginning(array)));
    }

    public static int[] moveZerosToTheBeginning(int[] array) {
        int writeIndex = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[writeIndex] = array[i];
                writeIndex--;
            }
        }

        for (int j = writeIndex; j >= 0; j--) {
            array[j] = 0;
        }
        return array;
    }
}
