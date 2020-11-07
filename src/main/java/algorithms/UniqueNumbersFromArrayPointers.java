package algorithms;

public class UniqueNumbersFromArrayPointers {
    public static void main (String [] args){
        int [] array = {2,2,3,5,6,9,3,6};
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
        for(int p = 0; p < writeIndex; p++){
            System.out.println(array[p]);
        }

    }
}
