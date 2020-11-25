package algorithms2;


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 6, 9, 15, 3, 4};

        for (int i = 1; i <= array.length; i++) { //how many times should we repeat going through array
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }

        }
    }
}