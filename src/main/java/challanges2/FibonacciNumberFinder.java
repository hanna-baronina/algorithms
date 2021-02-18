package challanges2;

public class FibonacciNumberFinder {
    public static void main(String[] args){
        int givenIndex = 1;
        System.out.println(getFibonacciNumberByIndex(givenIndex));
    }

    public static int getFibonacciNumberByIndex(int givenIndex){
        if (givenIndex == 0){
            return 0;
        }
        if (givenIndex == 1){
            return 1;
        }

        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        for(int i = 2; i <= givenIndex; i++){
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        return thirdNumber;
    }
}
