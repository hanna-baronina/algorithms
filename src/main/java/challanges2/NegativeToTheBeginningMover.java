package challanges2;

import java.util.Arrays;

public class NegativeToTheBeginningMover {
    public static void main(String[] args) {
        int[] array = {1, 4, 1, -4, -5, -3};
        System.out.println(Arrays.toString(moveNegative(array)));
    }

    public static int[] moveNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
