package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemsContainingCharactersPrinter {
    public static String[] getItemsContainingCharacters(String[] array, String givenWord) {
        Map<Character, Integer> givenWordCharactersCount = new HashMap<>();
        List<String>  resultList = new ArrayList<String>();
        for (char letter : givenWord.toCharArray()) {
            int currentCount = givenWordCharactersCount.getOrDefault(letter, 0);
            currentCount++;
            givenWordCharactersCount.put(letter, currentCount);
        }

        for (String word : array) {
            Map<Character, Integer> wordCharactersCount = new HashMap<>();

            for (char letter : word.toCharArray()) {
               int currentValue = wordCharactersCount.getOrDefault(letter, 0);
               currentValue++;
               wordCharactersCount.put(letter,currentValue);
            }

            boolean hasAllLetters = true;
            for (Map.Entry<Character, Integer> entry : givenWordCharactersCount.entrySet()) {
                if (!(wordCharactersCount.containsKey(entry.getKey())
                        && wordCharactersCount.get(entry.getKey()) >= (entry.getValue()))) {
                    hasAllLetters = false;
                    break;
                }
            }

            if(hasAllLetters){
                resultList.add(word);
            }
        }

        return resultList.toArray(new String[0]);
    }
}
