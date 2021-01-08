package challenges;


import java.util.Arrays;

public class TwoOrderedListsMerger {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 7, 8, 0, 0, 0};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.toString(mergeTwoLists(array1, array2)));
    }

    public static int[] mergeTwoLists(int[] array1, int[] array2) {
        int firstIndex = 0;
        int secondIndex = 0;
        while (secondIndex < array2.length) {
            if (array1[firstIndex] == 0) {
                array1[firstIndex] = array2[secondIndex];
                secondIndex++;
                firstIndex++;
            } else if (array1[firstIndex] < array2[secondIndex]) {
                firstIndex++;
            } else {
                for (int i = array1.length - 1; i > firstIndex; i--) {
                    array1[i] = array1[i - 1];
                }
                array1[firstIndex] = array2[secondIndex];
                secondIndex++;
                firstIndex++;

            }
        }

        return array1;
    }
}
