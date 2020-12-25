package challenges;

import java.util.Arrays;

public class TripletsMakingSumFinder {
    public static void main(String[] args) {
        int[] array = {1, -2, 0, 5, -1, -4};
        printTriplets(array);
    }

    static void printTriplets(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 2) {
                        int[] arrayResult = {array[i], array[j], array[k]};
                        System.out.println(Arrays.toString(arrayResult));
                    }
                }
            }
        }
    }
}
