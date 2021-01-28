package challanges2;

public class AllTenthElementsSumFinder {
    public static boolean getSumOfAllTens(int[] array) {
        int sum = 0;
        for (int digit : array) {
            if (digit == 10) {
                sum = sum + digit;
            }
        }
        if (sum == 30) {
            return true;
        }
        return false;
    }
}
