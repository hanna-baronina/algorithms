package challanges2;

import java.util.Arrays;

public class DuplicatesFromArrayRemover2 {
    public static void main (String[] args){
        int[] array = {1,2,1,2,3};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
    public static int[] removeDuplicates(int[] array){
        int writeIndex = 0;

        for(int i = 0; i < array.length; i++){
            boolean hasDuplicate = false;
            for(int j = 0; j < writeIndex; j++){
                if(array[i] == array[j]){
                    hasDuplicate = true;
                }
            }

            if(!hasDuplicate){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }
        return Arrays.copyOfRange(array, 0, writeIndex);
    }
}
