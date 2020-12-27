package challenges;

import java.util.Arrays;

public class AllSubArraysPrinter {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printAllSubArrays(array);

    }

    public static void printAllSubArrays(int[] array){
        for(int i = 1; i <= array.length; i++){
            for(int j = 0; j <= array.length - i; j++){
                int[] resultArray = new int[i];
                for(int k = 0; k < i; k++){
                    resultArray[k] = array[k + j];
                }
                System.out.println(Arrays.toString(resultArray));
            }
        }
    }
}
