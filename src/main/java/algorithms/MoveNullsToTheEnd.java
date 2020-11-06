package algorithms;

import java.util.Arrays;

public class MoveNullsToTheEnd {
    public static void main (String [] args){
        int [] array = {1,0,1,0,0,1,1};
        int writeIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0) {
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        while(writeIndex < array.length){
            array[writeIndex] = 0;
            writeIndex++;
        }

        System.out.println(Arrays.toString(array));
    }
}
