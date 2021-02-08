package challanges2;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharFinder2 {
    public static void main (String[] args){
        String str = "Is it your first company";
        System.out.println(getFirstNonRepeatingChar(str));
    }
    public static char getFirstNonRepeatingChar(String str){
        str = str.toLowerCase();
       char[] characters =  str.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
       for(char letter : characters){
           if(charCount.containsKey(letter)){
               int count = charCount.get(letter);
               count++;
               charCount.put(letter, count);
           } else {
               charCount.put(letter, 1);
           }
       }
       for(char letter : characters){
           if(charCount.get(letter) ==  1){
               return letter;
           }
       }
       return ' ';
    }
}
