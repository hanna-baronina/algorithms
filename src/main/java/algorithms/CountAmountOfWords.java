package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountAmountOfWords {
    public static void main(String[] args){
        String sentence = "  an apple a  day  apple a day ";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<String, Integer>();

        for(String word : words){
            if(word.equals("")){
                continue;
            }
            if(wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word)+ 1);
            } else {
                wordsCount.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> word : wordsCount.entrySet()){
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
