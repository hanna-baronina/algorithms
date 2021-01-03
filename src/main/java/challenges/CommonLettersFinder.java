package challenges;

import java.util.HashSet;
import java.util.Set;

public class CommonLettersFinder {
    public static Character[] getCommonLetters(String word1, String word2){
        Set<Character> uniqueCharacters = new HashSet<>();
        for(char character : word1.toCharArray()){
            if((!uniqueCharacters.contains(character)) && word2.indexOf(character) != -1){
                uniqueCharacters.add(character);
            }
        }
        return uniqueCharacters.toArray(new Character[0]);
    }
}
