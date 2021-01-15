package challenges;

import java.util.Arrays;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        int[] array = {1, 3, 16, 3, 2, 9};
        System.out.println(Arrays.toString(replaceWithGreatest(array)));
    }

    public static int[] replaceWithGreatest(int[] array) {
        int currentMax = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < currentMax) {
                array[i] = currentMax;
            } else {
                currentMax = array[i];
                array[i] = -1;
            }
        }
        return array;
    }
}
