package challanges2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverser {
    public static void main (String[] args){
        int[] array = {1,5,8,2,9,10};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static Integer[] reverseArray(int[] array){
        List<Integer> reversedList = new ArrayList<>();

        for(int i = array.length -1; i >= 0; i--){
            reversedList.add(array[i]);
        }
        return reversedList.toArray(new Integer[0]);
    }
}
