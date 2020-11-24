package algorithms2;

import java.util.Arrays;

public class TestMoveNullsToEnd {
    public static void main (String [] args){
        int [] array = {1, 1, 0, 0, 1, 1, 1};

        int writeIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }
        for(int p = writeIndex; p < array.length; p++){
            array[p] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
