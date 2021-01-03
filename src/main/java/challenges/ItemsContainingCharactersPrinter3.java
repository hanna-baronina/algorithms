package challenges;

import java.util.ArrayList;
import java.util.List;

public class ItemsContainingCharactersPrinter3 {

    public static String[] getItemsContainingCharacters(String[] words, String givenWord) {
        List<String> resultList = new ArrayList<>();
        for (String word : words) {
            int[] charactersCount = new int[26];
            for (char character : word.toCharArray()) {
                int position = character - 'a';
                charactersCount[position]++;
            }

            boolean hasAllLetters = true;
            for (char character : givenWord.toCharArray()) {
                int position = character - 'a';
                if (charactersCount[position] > 0) {
                    charactersCount[position]--;
                } else {
                    hasAllLetters = false;
                    break;
                }
            }

            if (hasAllLetters) {
                resultList.add(word);
            }
        }
        return resultList.toArray(new String[0]);
    }
}