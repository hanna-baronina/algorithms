package challenges;

import java.util.Arrays;

public class LongestConsecutiveSubArrayFinder {
    public static void main(String[] args) {
      int[] array = {7, 1, 3, 8, 2, 4, 10, 6, 9,11};
        System.out.println(getConsecutiveSubArray(array));
    }

    public static int getConsecutiveSubArray(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int maxCount = 1;
        int count = 1;

        for(int i = 1; i < array.length; i++){
            if(array[i] == array[i - 1] + 1){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}
