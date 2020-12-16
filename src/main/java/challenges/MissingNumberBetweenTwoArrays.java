package challenges;

import java.util.Arrays;

public class MissingNumberBetweenTwoArrays {
    public static void main(String[] args) {
        int[] givenArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5,6};
        System.out.println(getMissingNumber(givenArray, expectedArray));
    }

    public static int getMissingNumber(int[] givenArray, int[] expectedArray){
        Arrays.sort(givenArray);
        int givenArrIndex = 0;
        int expArrIndex = 0;

        while(givenArrIndex < givenArray.length){
            if (givenArray[givenArrIndex] > expectedArray[expArrIndex]){
                return expectedArray[expArrIndex];
            } else {
                expArrIndex++;
                givenArrIndex++;
            }
        }
        return expectedArray[expArrIndex];
    }
}
