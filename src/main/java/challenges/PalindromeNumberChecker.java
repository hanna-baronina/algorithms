package challenges;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        int number = 1221;
        System.out.println(isNumberPalindrome(number));
    }

    public static boolean isNumberPalindrome(int number){
       String numberInString =  String.valueOf(number);
       int startIndex = 0;
       int endIndex = numberInString.length() - 1;

       while(startIndex <= endIndex){
           if(numberInString.charAt(startIndex) != numberInString.charAt(endIndex)){
               return false;
           } else {
               startIndex++;
               endIndex--;
           }
       }
       return true;
    }
}
