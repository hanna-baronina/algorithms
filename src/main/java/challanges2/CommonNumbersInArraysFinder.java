package challanges2;

import java.util.HashSet;
import java.util.Set;

public class CommonNumbersInArraysFinder {
    public static void main (String[] args){
        int[] array1 = {2,3,5,7,9};
        int[] array2 = {1,4,6,9,8,7,9};
        getCommonNumbers(array1, array2);
    }

    public static void getCommonNumbers(int[] array1, int[] array2){
        Set<Integer> firstArrayNumbers = new HashSet<>();

        for(int number : array1){
            firstArrayNumbers.add(number);
        }

        Set<Integer> printedNumbers = new HashSet<>();
        for(int number : array2){
            if(firstArrayNumbers.contains(number)){
                if(!printedNumbers.contains(number)){
                    System.out.println(number);
                    printedNumbers.add(number);
                }
            }
        }
    }
}
