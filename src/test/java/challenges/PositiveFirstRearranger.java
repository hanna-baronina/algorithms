package challenges;

import java.util.Arrays;

public class PositiveFirstRearranger {
    public static void main(String[] args){
        int[] array = {-1, -2, 4,-3, 4,5};
        System.out.println(Arrays.toString(reArrangePositiveFirst(array)));
    }
    public static int[] reArrangePositiveFirst(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                for(int j = i + 1; j < array.length; j++){
                    if(array[j] > 0){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }
}
