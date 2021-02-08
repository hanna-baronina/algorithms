package challanges2;

import java.util.HashMap;
import java.util.Map;

public class AnagramWordsChecker {
    public static void main (String[] args){
        String str1 = "world";
        String str2 = "droln";
        System.out.println(isAnagramWords(str1, str2));
    }


    public static boolean isAnagramWords(String str1, String str2){
        if(str1.length() != str2.length() ){
            return false;
        }

        Map<Character, Integer> characters = new HashMap<>();
        for(char letter : str2.toCharArray()){
            if(characters.containsKey(letter)){
                int count = characters.get(letter);
                count++;
                characters.put(letter, count);
            } else {
                characters.put(letter, 1);
            }
        }

        for(char letter : str1.toCharArray()){
            if(characters.containsKey(letter)){
                int count = characters.get(letter);
                if(count > 1){
                    count--;
                    characters.put(letter, count);
                } else {
                    characters.remove(letter);
                }

            }
        }

        return characters.isEmpty();
    }
}
