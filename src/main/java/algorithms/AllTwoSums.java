package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllTwoSums {
    public static void main(String[] args){
        int[] array = {3,5,2,4,6,7,2,6};
        int target = 9;
        Map<Integer, Integer> foundNumbers = new HashMap<Integer, Integer>();

        for(int i = 0; i <array.length; i++){
            int secondNumber = target - array[i];
            if (foundNumbers.containsKey(secondNumber)){
                int[] result = {foundNumbers.get(secondNumber), i};
                System.out.println(Arrays.toString(result));
            } else {
                foundNumbers.put(array[i], i);
            }
        }

    }
}
