package challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateDigitsPrinter3 {
    public static Set<Integer> findDuplicateValues(int[] array) {
        Map<Integer, Integer> numbersAppearance = new HashMap<>();
        for(int number : array) {
            if(numbersAppearance.containsKey(number)) {
                int value = numbersAppearance.get(number);
                numbersAppearance.put(number, value + 1);
            } else {
                numbersAppearance.put(number, 1);
            }
        }

        Set<Integer> results = new HashSet<>();
        for(Map.Entry<Integer, Integer>  entry : numbersAppearance.entrySet()) {
            if(entry.getValue() > 1){
                results.add(entry.getKey());
            }
        }
        return results;
    }
}
