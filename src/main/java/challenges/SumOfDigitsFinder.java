package challenges;

public class SumOfDigitsFinder {
    public static void main (String[] args){
        int number = 1;
        System.out.println(getOneDigitSum(number));
    }

    public static int getOneDigitSum(int number){
        int sum = 0;
        int t = number;
        while(t != 0){
            sum = sum + t % 10;
            t = t /10;
        }
        int resultSum = 0;
        while(sum != 0){
            resultSum = resultSum + sum%10;
            sum = sum /10;
        }

        return resultSum;
    }
}
