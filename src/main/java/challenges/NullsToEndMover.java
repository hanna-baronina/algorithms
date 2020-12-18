package challenges;

import java.util.Arrays;

public class NullsToEndMover {
    public static void main(String[] args) {
        int[] array = {1,2,0,0,3,4};
        System.out.println(Arrays.toString(moveNulls(array)));
    }

    public static int[] moveNulls(int[] array){
        int writeIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        while(writeIndex < array.length){
            array[writeIndex] = 0;
            writeIndex++;
        }
        return array;
    }
}
