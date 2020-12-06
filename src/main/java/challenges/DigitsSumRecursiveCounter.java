package challenges;

public class DigitsSumRecursiveCounter {
    public static void main(String[] args) {
        int number = 102;
        System.out.println(calculateSum(number));
    }

    public static int calculateSum(int number) {
        if (number == 0) {
            return 0;
        }

        int digit = number % 10;
        number = number / 10;
        return digit + calculateSum(number);
    }
}
