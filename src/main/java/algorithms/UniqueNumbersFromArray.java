package algorithms;

public class UniqueNumbersFromArray {
    public static void main (String [] args) {
        int[] array = {1,3,4,5,3,0,5,9};
        boolean hasDuplicate = false;
        for(int i = 0 ; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                     hasDuplicate = true;
                     break;
                } else {
                    hasDuplicate = false;
                }
            }
            if(!hasDuplicate){
                System.out.println(array[i]);
            }
        }
    }
}
