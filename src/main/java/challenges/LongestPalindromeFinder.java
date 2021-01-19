package challenges;

public class LongestPalindromeFinder {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxxofnworbquickthe";
        System.out.println(getLongestPalindromeSubString(sentence));
    }
    public static String getLongestPalindromeSubString(String sentence){
        char[] sentenceLetters = sentence.toCharArray();

        for(int i = sentenceLetters.length; i >=2; i--){
            for(int j = 0; j < sentenceLetters.length - i; j++){
                String substring = sentence.substring(j, j + i);
                if(isPalindromic(substring)){
                    return substring;
                }
            }
        }
        return sentence;
    }

    public static boolean isPalindromic(String substring){
        char[] letters = substring.toCharArray();

        int startIndex = 0;
        int endIndex = letters.length -1;
        boolean isPalindrome = true;
        while(startIndex < endIndex){
            if (letters[startIndex] == letters[endIndex]) {
                startIndex++;
                endIndex--;
            } else {
               return isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
