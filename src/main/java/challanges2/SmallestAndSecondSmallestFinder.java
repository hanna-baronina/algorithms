package challanges2;

import java.util.Arrays;

public class SmallestAndSecondSmallestFinder {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 3, 2};
        getSmallestAndSecondSmallest(array);
    }

    public static void getSmallestAndSecondSmallest(int[] array) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length - 1] + "," + array[array.length - 2]);
    }
}
