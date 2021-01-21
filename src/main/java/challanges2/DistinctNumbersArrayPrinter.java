package challanges2;

import java.util.Arrays;

public class DistinctNumbersArrayPrinter {
    public static void main (String[] args){
        int[] array = {1,2,1,4,6};
        System.out.println(Arrays.toString(getDistinctNumbersArray(array)));

    }

    public static int[] getDistinctNumbersArray(int[] array){
        int writeIndex = 0;
        for(int investigate = 0; investigate < array.length; investigate++){
            boolean hasDuplicate = false;
            for(int verify = 0; verify < writeIndex; verify++){
                if(array[investigate] == array[verify]){
                    hasDuplicate = true;
                }
            }
            if(!hasDuplicate){
                array[writeIndex] = array[investigate];
                writeIndex++;
            }
        }
        return Arrays.copyOfRange(array, 0, writeIndex);
    }
}
