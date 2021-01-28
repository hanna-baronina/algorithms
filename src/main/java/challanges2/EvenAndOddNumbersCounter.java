package challanges2;

public class EvenAndOddNumbersCounter {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4, 4, 0, -1};
        countEvenAndOdd(array);
    }

    public static void countEvenAndOdd(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Amount of even" + ":" + countEven);
        System.out.println("Amount of odd" + ":" + countOdd);
    }
}
