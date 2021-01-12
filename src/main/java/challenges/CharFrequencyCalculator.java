package challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFrequencyCalculator {
    public static void main (String[] args){
        String input = "kablw1";
        getCharsFrequency(input);
    }

    public static void getCharsFrequency(String input){
        Map<Character,Integer> charsCount = new HashMap<>();
        for(char character : input.toCharArray()){
            if(character != ' '){
                if(charsCount.containsKey(character)){
                    int count = charsCount.get(character) + 1;
                    charsCount.put(character, count);
                } else {
                    charsCount.put(character, 1);
                }
            }
        }

        Set<Character> printed = new HashSet<>();
        for(char character : input.toCharArray()){
            if(!printed.contains(character)){
                int count = charsCount.get(character);
                printed.add(character);
                System.out.println(character + ":" + count);
            }

        }

        for(Map.Entry<Character, Integer> entry : charsCount.entrySet()){
             System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
