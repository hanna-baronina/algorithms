package challenges;


public class SecondLargestElementFinder {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 2, 4};
        System.out.println(getSecondLargestElement(array));
    }

    public static int getSecondLargestElement(int[] array) {
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[array.length - 2];
    }
}
