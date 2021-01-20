package challenges;

import java.util.Arrays;

public class SecondMostFrequentCharFinder {
    public static void main (String[] args){
        String word = "success";
        System.out.println(getSecondMostFrequent(word));

    }

    public static char getSecondMostFrequent(String word){
        char[] letters = word.toCharArray();
        int[] lettersCount = new int[26];

        for(char letter : letters){
            int position = letter - 'a';
            System.out.println(position);
            lettersCount[position]++;
        }
        int maxCount = 0;
        int secondMaxCount = 0;
        int positionMax = 0;
        int positionSecondMax = 0;

        System.out.println(Arrays.toString(lettersCount));

        for(int i = 0; i < lettersCount.length; i++){
            if(lettersCount[i] > maxCount){
                secondMaxCount = maxCount;
                maxCount = lettersCount[i];
                positionSecondMax = positionMax;
                positionMax = i;
            }
        }
        return (char)('a' + positionSecondMax);
    }
}
