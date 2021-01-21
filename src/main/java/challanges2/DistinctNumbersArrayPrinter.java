package challanges2;

import java.util.Arrays;

public class DistinctNumbersArrayPrinter {
    public static void main (String[] args){
        int[] array = {1,2,1,4,6};
        System.out.println(Arrays.toString(getDistinctNumbersArray(array)));

    }

    public static int[] getDistinctNumbersArray(int[] array){
        int writeIndex = 0;
        for (int investigator = 0; investigator < array.length; investigator++){
            boolean hasDuplicate = false;
            for (int verifier = 0; verifier < writeIndex; verifier++){
                if (array[investigator] == array[verifier]){
                    hasDuplicate = true;
                    break;
                }
            }
            if (!hasDuplicate){
                array[writeIndex] = array[investigator];
                writeIndex++;
            }
        }
        return Arrays.copyOfRange(array, 0, writeIndex);
    }
}
