package challenges;

import java.util.HashSet;
import java.util.Set;

public class PangramSentenceChecker {
    public static void main (String[] args){
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangramSentence(sentence));
    }

    public static boolean isPangramSentence(String sentence){
        char[] characters = sentence.toCharArray();
        Set<Character> charactersInSet = new HashSet<>();

        for (char character : characters){
            if(character - 'a' >= 0){
                charactersInSet.add(character);
            }
        }

        for (int i = 0; i < 26; i ++){
            if (!charactersInSet.contains((char)('a' + i))){
                return false;
            }
        }
        return true;
        //return  (charactersInSet.size() == 26);

        }
    }
