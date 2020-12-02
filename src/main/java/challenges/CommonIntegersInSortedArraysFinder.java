package challenges;

import java.util.ArrayList;
import java.util.List;

public class CommonIntegersInSortedArraysFinder{

    public static Integer[] getCommonIntegers(int[] firstArray, int[] secondArray){
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        List<Integer> resultArrayList = new ArrayList<>();

        while (firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length){
            if(firstArray[firstArrayIndex] == secondArray[secondArrayIndex]){
                resultArrayList.add(firstArray[firstArrayIndex]);
                firstArrayIndex++;
                secondArrayIndex++;
            } else if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
                firstArrayIndex++;
            } else {
                secondArrayIndex++;
            }
        }
        return resultArrayList.toArray(new Integer[0]);
    }
}
