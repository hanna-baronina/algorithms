package algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String [] args){
        int [] array = {3,1,5,2,9,6,10};

        for (int i = 0; i < array.length; i++ ){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j +1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
