package challanges2;

public class NumberDigitsSumFinder {
    public static void main (String[] args){
        int number = 298;
        System.out.println(getDigitsSum(number));
    }

    public static int getDigitsSum(int number){
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        while (sum > 9) {
            int finalSum = 0;
            while(sum != 0){
                int digit = sum % 10;
                finalSum = finalSum + digit;
                sum = sum / 10;
            }
            sum = finalSum;
        }
        return sum;
    }
}
