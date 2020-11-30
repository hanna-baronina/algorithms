package challenges;

import java.util.HashSet;
import java.util.Set;

public class DistinctWordsFromSentence {
    static String getDistinctWords(String sentence) {
        sentence = sentence.toLowerCase();
        String[] wordsArray = sentence.split(" ");
        Set<String> wordsSet = new HashSet<>();
        for(String word : wordsArray){
            if(word.length() > 0){
                wordsSet.add(word);
            }
        }
        return wordsSet.toString();
    }
}
