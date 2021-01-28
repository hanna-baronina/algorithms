package challanges2;

import java.util.Arrays;

public class SmallestAndLargestFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, 8};
        System.out.println(getDifferenceBetweenLargestAndSmallest(array));
    }

    public static int getDifferenceBetweenLargestAndSmallest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
        return largest - smallest;
    }
}
