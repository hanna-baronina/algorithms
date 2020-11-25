package algorithms2;

import java.util.Arrays;

public class TestMoveNullsToEnd {
    public static void main(String[] args){
        int[] array = {1,0,0,2,3,4,0};
        int writeIndex = 0;

        for(int readIndex = 0; readIndex < array.length; readIndex++){
            if(array[readIndex] != 0){
                array[writeIndex] = array[readIndex];
                writeIndex++;
            }
        }
        for(int p = writeIndex; p < array.length; p++){
            array[p] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}

