package challenges;

import java.util.Arrays;

public class NegativeFirstArranger {
    public static void main (String[] args){
        int[] array = {-1, -1, 3, 5,-2,-3};
        System.out.println(Arrays.toString(rearrangeNegativeFirst(array)));
        System.out.println(Arrays.toString(rearrangeNegativeFirst2(array)));
    }

    static int[] rearrangeNegativeFirst(int[] array){
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length - i; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        return array;
    }

    public static int[] rearrangeNegativeFirst2(int[] array){
        for(int i = 0 ; i < array.length; i++){
            if(array[i] > 0){
                for(int j = i + 1; j < array.length; j++){
                    if (array[j] < 0){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
