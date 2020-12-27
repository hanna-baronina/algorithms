package challenges;

public class SecondFrequentFinder {
    public static char getSecondFrequentCharacter(String word){
        char[] wordLetters = word.toCharArray();
        int[] lettersCount = new int[26];

        for(char letter : wordLetters){
           int position = letter - 'a';
           lettersCount[position]++;
        }

        int maxCount = 0;
        int maxIndex = 0;
        int secondMaxCount = 0;
        int secondMaxIndex = 0;

        for(int i = 0; i < lettersCount.length; i++){
            if(lettersCount[i] > maxCount){
                secondMaxCount = maxCount;
                secondMaxIndex = maxIndex;
                maxCount = lettersCount[i];
                maxIndex = i;
            }
        }
        return (char)('a' + secondMaxIndex);
    }
}
