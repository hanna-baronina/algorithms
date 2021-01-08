package challenges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroesToTheEnd {
    public static void main (String [] args){
        int[] array = {0,3,0,4,1,0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(array)));
    }

    public static int[] moveZerosToTheEnd(int[] array){
        int writeIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for (int j = writeIndex; j < array.length; j++){
            array[j] = 0;
        }
        return array;
    }
}
