package challenges;


import java.util.*;

public class WordsWithDuplicateLettersFinder {
    public static void main(String[] args) {
        String[] array = new String[]{"tree", "apple", "java", "desc", "tesla"};
        System.out.println(getListOfWordsWithoutDuplicateLetters(array).toString());
    }

    public static List<String> getListOfWordsWithoutDuplicateLetters(String[] array) {
        List<String> resultList = new ArrayList<>();
        for (String word : array) {
            char[] characters = word.toCharArray();
            Set<Character> charactersSet = new HashSet<>();
            for (char character : characters) {
                charactersSet.add(character);
            }
            if (charactersSet.size() == word.length()) {
                resultList.add(word);
            }
        }
        return resultList;
    }
}
