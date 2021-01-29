package challanges2;

import java.util.Arrays;

public class NegativeFirstMover {
    public static void main (String[] args){
        int[] array = {1,1,0,-2,-1};
        System.out.println(Arrays.toString(moveNegativeToTheBeginning(array)));
    }

    public static int[] moveNegativeToTheBeginning(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0){
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < 0){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }
}
