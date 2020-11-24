package algorithms2;

public class TestUniqueNumbersFromArray {
    public static void main(String [] args){
        int [] array = {3,4,3,5,6,3,4,9};
        int writeIndex = 1;

        for(int i = 1; i < array.length; i ++){
            boolean hasDuplicate = false;
            for(int j = 0; j < writeIndex; j++){
                if(array[i] == array[j]){
                    hasDuplicate = true;
                    break;
                }
            }
            if(!hasDuplicate){
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for (int p = 0; p < writeIndex; p++){
            System.out.println(array[p]);
        }

    }
}
