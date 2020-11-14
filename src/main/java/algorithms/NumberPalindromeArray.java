package algorithms;

import java.util.ArrayList;


public class NumberPalindromeArray {
    public static void main(String[] args) {
        int number = 8828;
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();

        while (number != 0) {
            int digit = number % 10;
            numbersArray.add(digit);
            number = number / 10;
        }

        System.out.println(numbersArray);

        int startIndex = 0;
        int endIndex = numbersArray.size() -1;
        boolean isPalindrome = true;

        while (startIndex < endIndex) {
            if (numbersArray.get(startIndex) == numbersArray.get(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

    }
}
