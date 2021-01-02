package challenges;

import java.util.ArrayList;
import java.util.List;

public class ItemsContainingCharactersPrinter2 {
    public static String[] getItemsContainingCharacters(String[] words, String givenWord){
        List<String> expected = new ArrayList<String>();
        for(String word : words){
            if (hasAllLetters(givenWord, word)){
                expected.add(word);
            }
        }

        String[] result = new String[expected.size()];
        for(int i = 0; i < expected.size(); i ++){
            result[i] = expected.get(i);
        }
        return result;
    }

    public static boolean hasAllLetters(String givenWord, String word){
        for (char letter : givenWord.toCharArray()){
            if(!hasLetter(letter, word)){
                return false;
            } else {
                word = word.substring(0, word.indexOf(letter))
                        + word.substring(word.indexOf(letter) + 1);
            }
        }
        return true;
    }

    public static boolean hasLetter(char letter, String word){
        if(word.indexOf(letter) != -1){
            return true;
        }
        return false;
    }
}
