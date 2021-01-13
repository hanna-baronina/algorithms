package challenges;

import java.util.ArrayList;
import java.util.List;

public class NearestPalindromeFinder {
    public static void main(String[] args){
        int givenNumber = 898;
        System.out.println(getNearestPalindrome(givenNumber));
    }

    public static int getNearestPalindrome(int givenNumber){
        int countIncrements = 0;
        int countDecrements = 0;
        int givenNumberIncrement = givenNumber;
        int givenNumberDecrement = givenNumber;
        while(!isPalindrome(givenNumberIncrement)){
            givenNumberIncrement++;
            countIncrements++;
        }

        while(!isPalindrome(givenNumberDecrement)){
            givenNumberDecrement--;
            countDecrements++;
        }

        if(countIncrements < countDecrements){
            return givenNumber + countIncrements;
        } else {
            return givenNumber - countDecrements;
        }
    }

    static boolean isPalindrome(int number){
        List<Integer> arrayList = new ArrayList<>();
        while(number != 0){
            int digit = number%10;
            number = number/10;
            arrayList.add(digit);
        }

        Integer[] array = arrayList.toArray(new Integer[0]);
        int startIndex = 0;
        int endIndex = array.length -1;
        boolean isEqual = true;
        while(startIndex < endIndex){
            if(!array[startIndex].equals(array[endIndex])){
                isEqual = false;
                break;
            } else {
                startIndex++;
                endIndex--;
            }
        }

        return isEqual;
    }

}
