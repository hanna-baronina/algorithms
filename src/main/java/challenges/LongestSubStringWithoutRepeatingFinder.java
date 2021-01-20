package challenges;

public class LongestSubStringWithoutRepeatingFinder {
    public static void main (String[] args){
        String word = "pickoutthelongestsubstring";
        System.out.println(getLongestNonRepeating(word));
    }

    public static int getLongestNonRepeating(String word) {

        int startIndex = 0;
        int maxLength = 0;
        char[] letters = word.toCharArray();


        for (int investigateIndex = 0; investigateIndex < letters.length; investigateIndex++){
            while (hasDuplicate(letters, startIndex, investigateIndex)){
                startIndex++;
            }
            int length = investigateIndex - startIndex + 1;
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static boolean hasDuplicate(char[] letters, int start, int end){
        boolean hasDuplicate = false;
        for (int j = start; j < end; j++){
            if (letters[j] == letters[end]) {
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}