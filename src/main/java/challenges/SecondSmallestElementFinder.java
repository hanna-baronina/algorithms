package challenges;

import java.util.Arrays;

public class SecondSmallestElementFinder {
    public static void main(String[] args) {
        int[] array = {1,5,7,2,4};
        System.out.println(getSecondSmallest(array));

    }
    public static int getSecondSmallest(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int start = 0;
        while (array[start] == array[start+1]) {
            start++;
        }
        return array[start+1];
    }
}
