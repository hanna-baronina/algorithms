package challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringOfUniqueCharactersWithSetFinder {
    public static void main (String[] args){
        String word = "abcdb";
        System.out.println(getLongestUniqueSubstringWithSet(word));
    }

    public static String getLongestUniqueSubstringWithSet(String word){
        int startIndex = 0;
        int endIndex = 0;
        char[] wordArray = word.toCharArray();
        Set<Character> characters = new HashSet<>();
        characters.add(wordArray[startIndex]);
        int longestStringStartIndex = 0;
        int longestStringEndIndex = 0;
        int longestStringLength = 0;

        while (endIndex < wordArray.length - 1){
            if(!characters.contains(wordArray[endIndex + 1])){
                characters.add(wordArray[endIndex + 1]);
                endIndex++;
                if((endIndex - startIndex) + 1 > (longestStringLength)){
                    longestStringLength = (endIndex - startIndex )+ 1;
                    longestStringStartIndex = startIndex;
                    longestStringEndIndex = endIndex;
                }
            } else {
                characters.remove(wordArray[startIndex]);
                startIndex++;
            }
        }
        char[] subArray = Arrays.copyOfRange(wordArray, longestStringStartIndex, longestStringEndIndex + 1);
        return String.valueOf(subArray);
    }
}
