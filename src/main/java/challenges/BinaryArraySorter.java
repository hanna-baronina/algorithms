package challenges;



public class BinaryArraySorter {
    public static int[] sortBinaryArray(int[] array){
        int writeIndex = 0;

        for(int i= 0; i < array.length; i++){
            if(array[i] != 0){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for(int p = writeIndex; p < array.length; p++){
            array[p] = 0;
        }

        return array;
    }
}
