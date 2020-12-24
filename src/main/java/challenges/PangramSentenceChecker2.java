package challenges;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramSentenceChecker2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jump over the lazy dog}";
        System.out.println(isPangram(sentence));

    }

    public static boolean isPangram(String sentence){
        sentence = sentence.toLowerCase();
        Set<Character> characters = new HashSet<>();
        char[] letters = sentence.toCharArray();
        for(char letter : letters){
            int position = letter - 'a';
            if (position >= 0 && position < 26){
                characters.add(letter);
            }
        }
        int setSize = characters.size();
        System.out.println(characters.toString());

        if (setSize == 26){
            return true;
        } else {
            return false;
        }
    }
}
