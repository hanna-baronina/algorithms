package challenges;

public class NearestPalindromeFinder2 {
    public static void main(String[] args){
        int givenNumber = 123;
        System.out.println(getNearestPalindrome(givenNumber));
    }

    static int getNearestPalindrome(int number){
        if(isPalindrome(number)){
            return number;
        }
        for(int i = 1; ;i++){
             if(isPalindrome(number - i)){
                 return number-i;
             }
             if(isPalindrome(number + i)){
                 return number+i;
             }
        }
    }

    static boolean isPalindrome(int number){
        int rev = 0;
        int temp = number;
        while (temp > 0){
            rev = rev * 10 + temp %10;
            temp = temp/10;
        }
        return rev == number;
    }
}
