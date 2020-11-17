package algorithms2;

import java.util.Arrays;

public class MoveNulls {
    public static void main (String [] args){
        int[] array = {1,0,0,1,0,1,1,0};
        int writeIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for(int j = writeIndex; j < array.length; j++){
            array[j] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
