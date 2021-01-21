package challanges2;

public class MissingNumbersInArraysFinder {
    public static void main (String[] args){
        int[] array1 = {1,2,3,5};
        int[] array2 = {2,3,5};
        System.out.println(getMissingNumber(array1, array2));
    }

    public static int getMissingNumber(int[] array1, int[] array2){
        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < array1.length || secondIndex < array2.length){
            if(firstIndex < array1.length && secondIndex < array2.length){
                if(array1[firstIndex] < array2[secondIndex]){
                    return array1[firstIndex];
                } else  if (array1[firstIndex] > array2[secondIndex]){
                    return array2[secondIndex];
                } else {
                    firstIndex++;
                    secondIndex++;
                }
            } else if (firstIndex == array1.length){
                return array2[secondIndex];
            } else {
                return array1[firstIndex];
            }
        }
        return -1;
    }
}

