package challanges2;

import java.util.*;

public class DuplicatesInStringArrayFinder {
    public static void main (String[] args){
        String[] array = {"A","B","C","D","A","B"};
        System.out.println(Arrays.toString(getDuplicateStrings(array)));
    }
    public static String[] getDuplicateStrings(String[] array){
        Map<String,Integer> appearanceCount = new HashMap<>();
        for (String letter : array){
            if (appearanceCount.containsKey(letter)){
                int count = appearanceCount.get(letter);
                count++;
                appearanceCount.put(letter, count);
            } else {
                appearanceCount.put(letter, 1);
            }
        }

        List<String> duplicateLetters = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : appearanceCount.entrySet()){
            if (entry.getValue() > 1){
                duplicateLetters.add(entry.getKey());
                System.out.println(entry.getKey());
            }
        }
        return duplicateLetters.toArray(new String[0]);
    }
}
