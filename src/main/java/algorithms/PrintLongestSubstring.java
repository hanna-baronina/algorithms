package algorithms;

import java.util.HashSet;
import java.util.Set;

public class PrintLongestSubstring {
    public static void main(String[] args){
        String sentence = "ABCADCD";
        int startIndex = 0;
        int endIndex = 0;
        int maxLength = 0;

        while(endIndex < sentence.length()){
            if(isUnique(sentence.substring(startIndex, endIndex+1))){
                int currentLength = endIndex - startIndex + 1;
                if (currentLength > maxLength){
                    maxLength = currentLength;
                }
                endIndex++;
            } else {
                startIndex++;
            }
        }
        System.out.println(maxLength);
    }

    private static boolean isUnique(String substring){
        Set<Character> substringChars = new HashSet<Character>();
        for (Character letter : substring.toCharArray()){
            substringChars.add(letter);
        }

        return substring.length() == substringChars.size();

    }
}