package challanges2;

import java.util.Arrays;

public class ElementFromArrayRemover {
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 3, 8, 100};
        int elementForRemoval = 101;
        System.out.println(Arrays.toString(removeElementFromArray(array, elementForRemoval)));
    }

    public static int[] removeElementFromArray(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        if (index == -1){
            return array;
        }
        if (index == array.length - 1) {
            array[index] = 0;
            return array;
        }
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
