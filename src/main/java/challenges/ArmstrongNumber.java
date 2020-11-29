package challenges;

public class ArmstrongNumber {

    static boolean isArmstrongNumber(int number){
        int actualNumber = number;
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();
        int sum = 0;

        while (number > 0){
           int digit = number % 10;
           number = number / 10;
           sum = sum + (int)Math.pow(digit,numberLength);
        }
        return sum == actualNumber;
    }
}
