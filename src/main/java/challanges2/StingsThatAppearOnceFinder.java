package challanges2;

import java.util.*;

public class StingsThatAppearOnceFinder {
    public static void main (String [] args){
        String[] array = {"A", "B", "C", "D", "D"};
        System.out.println(Arrays.toString(getLettersAppearingOnce(array)));
    }

    public static String[] getLettersAppearingOnce(String[] array){
        Map<String, Integer> lettersCount = new HashMap<>();

        for(String letter : array){
            if(lettersCount.containsKey(letter)){
               int count = lettersCount.get(letter);
               count++;
               lettersCount.put(letter, count);
            } else {
                lettersCount.put(letter, 1);
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : lettersCount.entrySet()){
            if(entry.getValue() == 1){
                String letter = entry.getKey();
                result.add(letter);
            }
        }
        return result.toArray(new String[0]);
    }
}
