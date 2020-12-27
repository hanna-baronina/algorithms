package challenges;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String word = "abcabd";
        System.out.println(getMaxPalindromeLength(word));
    }

    public static int getMaxPalindromeLength(String word){
        char[] letters = word.toLowerCase().toCharArray();
        int startIndex = 0;
        int endIndex = word.length()-1;
        int maxPalindromeLength = 0;
        while (startIndex < endIndex){
            if (letters[startIndex] == letters[endIndex]){
               int currentLength = word.substring(startIndex, endIndex + 1).length();
                startIndex++;
                endIndex--;
               if (currentLength > maxPalindromeLength){
                   maxPalindromeLength = currentLength;
               }
            } else {
                maxPalindromeLength = 0;
                startIndex++;
                endIndex--;
            }
        }
        return maxPalindromeLength;
    }
}
