package algorithms2;

public class UniqueNumbersFromArray {
    public static void main (String[] args){
        int[] array = {3,4,3,3,2,5,6,7};
        boolean hasDuplicate = false;

        for (int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    hasDuplicate = true;
                    break;
                } else {
                    hasDuplicate = false;
                }
            }
            if(!hasDuplicate){
                System.out.print(array[i]);
            }
        }

    }

}
