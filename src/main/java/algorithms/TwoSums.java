package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] array = {3,3,2,22,1};
        int target = 9;

        System.out.println(Arrays.toString(getTwoSums(array,target)));

    }

    private static int[] getTwoSums(int[] array, int target){
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for(int i = 0; i < array.length; i++){
            int secondNumber = target - array[i];
            if (numbers.containsKey(secondNumber)) {
                return new int[] {numbers.get(secondNumber), i};
            } else {
                numbers.put(array[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
