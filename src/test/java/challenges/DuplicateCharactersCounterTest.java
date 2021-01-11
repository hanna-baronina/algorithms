package challenges;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersCounter {
    public static void main(String [] args){
        String givenStr = "aa a a bb";
        System.out.println(countDuplicateChar(givenStr));
    }

    public static int countDuplicateChar(String givenStr){
        int countCharHasDuplicates = 0;
        Set<Character> addedChars = new HashSet<>();
        Set<Character> countedChars = new HashSet<>();
        for(char character : givenStr.toCharArray()){
            if(character !=  ' '){
                if(!addedChars.contains(character)){
                    addedChars.add(character);
                } else {
                    if(!countedChars.contains(character)){
                        countedChars.add(character);
                        countCharHasDuplicates++;
                    }
                }
            }
        }
        return countCharHasDuplicates;
    }
}
