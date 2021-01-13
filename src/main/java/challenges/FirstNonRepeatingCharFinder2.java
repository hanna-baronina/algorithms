package challenges;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharFinder2 {
    public static void main (String[] args){
        String input = "is it your first company";
        System.out.println(getFirstNonRepeating(input));
    }

    public static char getFirstNonRepeating(String input){
        char[] characters = input.toCharArray();
        Map<Character, Integer> charactersCount = new HashMap<>();

        for(char character : characters){
            if(character != ' '){
                if(charactersCount.containsKey(character)){
                    int count = charactersCount.get(character);
                    count++;
                    charactersCount.put(character, count);
                } else {
                    charactersCount.put(character, 1);
                }
            }
        }
        for(char character : characters ){
            if(character != ' '){
                if(charactersCount.get(character) == 1){
                    return character;
                }
            }
        }
        return ' ';

    }

}
