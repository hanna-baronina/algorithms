package challanges2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListItemsContainingLettersPrinter {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("rabbit");
        wordsList.add("bribe");
        wordsList.add("dogbi");

        String givenWord = "bib";

        printWordsContainingLetters(wordsList, givenWord);
    }

    public static void printWordsContainingLetters(List<String> wordsList, String givenWord) {
        Map<Character, Integer> givenWordCharsCount = new HashMap<>();
        char[] givenWordChars = givenWord.toCharArray();

        for (char character : givenWordChars) {
            if (givenWordCharsCount.containsKey(character)) {
                int count = givenWordCharsCount.get(character);
                count++;
                givenWordCharsCount.put(character, count);
            } else {
                givenWordCharsCount.put(character, 1);
            }
        }

        for (String word : wordsList) {
            char[] wordLetters = word.toCharArray();
            Map<Character, Integer> wordLettersCount = new HashMap<>();
            for (char letter : wordLetters) {
                if (wordLettersCount.containsKey(letter)) {
                    int count = wordLettersCount.get(letter);
                    count++;
                    wordLettersCount.put(letter, count);
                } else {
                    wordLettersCount.put(letter, 1);
                }
            }

            boolean hasAllLetters = true;
            for (Map.Entry<Character, Integer> charEntry : givenWordCharsCount.entrySet()) {
                if (wordLettersCount.containsKey(charEntry.getKey())) {
                    if (wordLettersCount.get(charEntry.getKey()) < charEntry.getValue()) {
                        hasAllLetters = false;
                    }
                }
            }
            if (hasAllLetters){
                System.out.println(word);
            }
        }
    }
}
