package challenges;

import java.util.HashSet;
import java.util.Set;

public class SumElementsFinder {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        int number = 6;
        getSumElements(array,number);
    }

    public static void getSumElements(int[] array, int num){
        Set<Integer> elements = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            int element = num - array[i];
            if(elements.contains(element)){
                System.out.println(array[i]+ "," + element);
            } else {
                elements.add(array[i]);
            }
        }
    }

}
