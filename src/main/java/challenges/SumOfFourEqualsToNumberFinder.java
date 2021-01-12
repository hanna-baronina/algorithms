package challenges;


import java.util.Arrays;

public class SumOfFourEqualsToNumberFinder {
    public static void main(String[] args){
        int[] array = {1,2,3,2,1,1,4,2};
        int givenValue = 8;
        findFourElementsEqualToSum(array, givenValue);
    }

    public static void findFourElementsEqualToSum(int[] array, int givenValue){

        for(int i = 0; i <= array.length - 4; i++){
            int sum = 0;
            for(int j = i; j < i + 4; j++){
                sum = array[j] + sum;
            }
            if(sum == givenValue){
                int[] result = Arrays.copyOfRange(array, i, i+ 4);
                System.out.println(Arrays.toString(result));
            }
        }
    }
}
