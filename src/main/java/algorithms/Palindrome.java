package algorithms;

public class Palindrome {
    public static void main (String [] args){
        String word = "1";
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome(String word){
        if (word == null || word.length() < 1){
            System.out.println("Incorrect word length");
            return false;
        }

        int leftPointer = 0;
        int rightPointer = word.length() - 1;

        while (leftPointer < rightPointer){
            if(word.charAt(leftPointer) != word.charAt(rightPointer)){
                return false;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}
