package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args){
        int[] array = {5,7,3,2,5,44,3,2,22,1,4,3};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i = i+3){
            numbers.add(array[i]);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 5) {
                iterator.remove();
                iterator.next();
            } else {
                iterator.next();
            }
        }

        numbers.remove(0) ;
        numbers.remove(numbers.size() -1);

        numbers.add(0, 5);

        Collections.sort(numbers);

        for(int number : numbers){
            System.out.println(number);
        }
    }
}
