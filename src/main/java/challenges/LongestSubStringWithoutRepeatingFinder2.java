package challenges;

public class LongestSubStringWithoutRepeatingFinder2 {
    public static void main(String [] args){
        String word = "pickoutthelongestsubstring";
        System.out.println(getLongestNonRepeating(word));
    }

    public static int getLongestNonRepeating(String word){
        int startIndex = 0;
        int maxLength = 0;
        char[] wordLetters = word.toCharArray();

        for (int investigateIndex = 0; investigateIndex < wordLetters.length; investigateIndex++){
            boolean hasDuplicate;
            do {
                hasDuplicate = false;
                for (int j = startIndex; j < investigateIndex; j++) {
                    if (wordLetters[j] == wordLetters[investigateIndex]) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (hasDuplicate) {
                    startIndex++;
                }
            } while (hasDuplicate);

            int length = investigateIndex - startIndex + 1;
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
