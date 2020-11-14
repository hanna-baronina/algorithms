package algorithms;

public class NumberPalindrome {
    public static void main(String[] args){
        int number = 8888;
        String numberString = Integer.toString(number);
        System.out.println(numberString);
        int startIndex = 0;
        int endIndex = numberString.length() -1;
        boolean isPalindrome = true;

        while(startIndex < endIndex){
            if(numberString.charAt(startIndex) == numberString.charAt(endIndex)){
                startIndex++;
                endIndex--;
                continue;

            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
