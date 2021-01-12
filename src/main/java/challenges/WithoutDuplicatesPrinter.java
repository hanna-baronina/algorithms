package challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WithoutDuplicatesPrinter {
    public static void main (String [] args){
        String input = "abacdd";
        System.out.println(returnWithoutDuplicates(input));
        printWithoutDuplicates(input);
        System.out.println();
        returnWithoutDuplicatesSet(input);

    }

    public static char[] returnWithoutDuplicates(String input){
       int writeIndex = 0;
       char[] array = input.toCharArray();
       for(int i = 0; i < array.length; i++){
           boolean hasDuplicate = false;
           for(int j = 0; j < writeIndex; j++){
               if(array[i] == array[j]){
                   hasDuplicate = true;
               }
           }
           if(!hasDuplicate){
               array[writeIndex] = array[i];
               writeIndex++;
           }
       }
       return Arrays.copyOf(array, writeIndex);
    }

    public static void printWithoutDuplicates(String input){
        char[] array = input.toCharArray();
        for(int i = 0; i < array.length; i++){
            boolean hasDuplicate = false;
            for(int j = 0; j < i; j++){
                if(array[i] == array[j]){
                    hasDuplicate = true;
                }
            }
            if(!hasDuplicate){
                System.out.print(array[i]);
            }
        }
    }

    public static void returnWithoutDuplicatesSet(String input){
        Set<Character> printed = new HashSet<>();
        char[] characters = input.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(!printed.contains(characters[i])){
                printed.add(characters[i]);
                System.out.println(characters[i]);
            }
        }
    }
}
