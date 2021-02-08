package challanges2;

import java.util.Arrays;

public class PangramSentenceChecker {
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }

    public static boolean isPangram (String str){
        str = str.toLowerCase();
        int[] result = new int[26];
        for(char letter : str.toCharArray()){
            if(letter != ' '){
               int position =  letter - 'a';
               result[position]++;
            }
        }
        System.out.println(Arrays.toString(result));
        boolean hasAllLetters = true;
        for(int i = 0; i < result.length; i++){
            if(result[i] < 1){
                hasAllLetters = false;
            }
        }
        return hasAllLetters;
    }
}

