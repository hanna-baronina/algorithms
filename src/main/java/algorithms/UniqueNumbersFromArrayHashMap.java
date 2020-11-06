package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumbersFromArrayHashMap {
    public static void main (String [] args){
        int [] array = {1,3,4,5,3,0,5,9};
        HashMap<Integer, Integer> uniqueValues = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++){
            uniqueValues.put(array[i],i);
        }
        System.out.println(uniqueValues.keySet());
    }
}
