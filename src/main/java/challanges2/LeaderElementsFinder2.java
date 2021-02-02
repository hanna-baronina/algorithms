package challanges2;

public class LeaderElementsFinder2 {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 5, 4, 2, 3};
        printLeaderElements(array);
    }

    public static void printLeaderElements(int[] array) {
        int maxElement = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > maxElement) {
                System.out.println(array[i]);
                maxElement = array[i];
            }
        }
    }
}
