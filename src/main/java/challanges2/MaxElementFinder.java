package challanges2;

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] array = {-10, -4, -6, -22, -2};
        System.out.println(getMaxElement(array));
    }

    public static int getMaxElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
