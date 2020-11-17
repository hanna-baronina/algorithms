package algorithms2;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumbersFromArrayHasMap {
    public static  void main (String[] args){
        int[] array = {3,4,3,3,2,5,6,7};
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        boolean hasDuplicate = false;

        for(int i = 0; i < array.length; i++){
           if (numbers.containsKey(array[i])){
               continue;
           } else {
               numbers.put(array[i], i);
           }
        }
        System.out.println(numbers.keySet());
    }

}
