package challanges2;

import java.util.Arrays;

public class PangramChecker {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangramSentence(sentence));

    }

    public static boolean isPangramSentence(String sentence){
       char[] sentenceLetters = sentence.toLowerCase().toCharArray();
       int[] lettersCount = new int[26];
       for(char letter : sentenceLetters){
           if(letter != ' '){
               int position = letter -'a';
               lettersCount[position]++;
           }
       }
       System.out.println(Arrays.toString(lettersCount));
       boolean isPangram = true;
        for(int i = 0; i < lettersCount.length; i++){
            if(lettersCount[i] < 1){
                isPangram = false;
            }
        }
        return isPangram;
    }
}
