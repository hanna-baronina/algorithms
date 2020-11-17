package algorithms2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main (String[] args){
        int[] array = {3,2,5,2,1,3,4};
        int sum = 7;

        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for(int i = 0; i < array.length; i++){
           int secondNumber = sum - array[i];
           if(numbers.containsKey(secondNumber)){
               int[] result = {numbers.get(secondNumber), i};
               System.out.println(Arrays.toString(result));
               break;
           } else {
               numbers.put(array[i], i);
           }

        }
    }
}
