package algorithms2;

import java.util.Arrays;

public class AllSubArrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        for(int m = 1; m <= array.length; m++){
            for(int i = 0; i <= array.length - m; i++){
                int[] subArray = new int[m];
                for(int j = 0; j < subArray.length; j++){
                    subArray[j] = array[i + j];
                }
                System.out.println(Arrays.toString(subArray));
            }
        }

    }
}
