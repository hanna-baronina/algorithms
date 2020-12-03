package challenges;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumberinArrayChecker {
    public static void main (String[] args){
        int number = 1;
        System.out.println(isPailndromeNumber(number));

    }
    public static boolean isPailndromeNumber(int number) {
        List<Integer> digitsList = new ArrayList<>();
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            digitsList.add(digit);
        }
        int startIndex = 0;
        int endIndex = digitsList.size() - 1;

        while (startIndex <= endIndex) {
            if (digitsList.get(startIndex) != digitsList.get(endIndex)) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }
}
