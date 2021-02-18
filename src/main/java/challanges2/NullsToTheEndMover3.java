package challanges2;

import java.util.Arrays;

public class NullsToTheEndMover3 {
    public static void main (String[] args){
        int[] array = {1,0,1,0,1,0};
        System.out.println(Arrays.toString(moveNullsToTheEnd(array)));
    }

    public static int[] moveNullsToTheEnd(int[] array){

        int writeIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 1){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }
        return Arrays.copyOfRange(array, 0, writeIndex);
    }
}
