package challanges2;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentLetterFinder {
    public static void main (String[] args){
        String str = "successes";
        System.out.println(getSecondMostFrequent(str));
    }

    public static char getSecondMostFrequent(String str){
        Map<Character, Integer> characters = new HashMap<>();
        char[] strCharacters = str.toCharArray();

        for(char character : strCharacters){
            if(characters.containsKey(character)){
              int count = characters.get(character);
              count++;
              characters.put(character, count);
            } else {
                characters.put(character, 1);
            }
        }
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : characters.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
            }
        }
        int secondMax = 0;
        char secondChar = ' ';
        for(Map.Entry<Character, Integer> entry : characters.entrySet()){
            if(entry.getValue() > secondMax && entry.getValue() != maxCount){
                secondMax = entry.getValue();
                secondChar = entry.getKey();
            }
        }
        return secondChar;
    }
}
