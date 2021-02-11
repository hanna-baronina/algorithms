package challanges2;

import java.util.HashSet;
import java.util.Set;

public class SmallestSubstringContainingAllLettersFinder {
    public static void main (String[] args){
        String str = "welcome to w3resource";
        String str2 = "tower";
        System.out.println(findSmallestContainingLetters(str, str2));
    }

    public static String findSmallestContainingLetters(String str, String st2){

        for(int i = 4; i <= str.length(); i++){
            for(int j = 0; j <= str.length() - i; j++){
                String subString = str.substring(j, j + i);
                if(hasAllLetters(subString, st2)){
                    return subString;
                }
            }
        }
        return "not found";
    }

    public static boolean hasAllLetters (String subString, String str2){
        Set<Character> characters = new HashSet<>();
       char[] subStringCharacters = subString.toCharArray();

       for(char character : subStringCharacters){
         characters.add(character);
       }
       boolean hasAllLetters = true;
       for(char letter : str2.toCharArray()){
           if(!characters.contains(letter)){
               hasAllLetters = false;
           }
       }
       return hasAllLetters;
    }
}
