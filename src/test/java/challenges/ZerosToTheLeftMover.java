package challenges;

import java.util.Arrays;

public class ZerosToTheLeftMover {
    public static void main(String[] args){
        int[] array = {1,0,1,0,0,1,0};
        System.out.println(Arrays.toString(moveZerosToTheLeft(array)));
    }

    public static int[] moveZerosToTheLeft(int[] array){
        int writeIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for(int j = writeIndex; j < array.length; j++){
            array[j] = 1;
        }

        return array;
    }
}
