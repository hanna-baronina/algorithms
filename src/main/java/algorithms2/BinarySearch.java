package algorithms2;

public class BinarySearch {
    public static void main (String[] args){
        int[] array = {1,3,5,7,8,9,11,13,16,22};
        int searchNumber = 16;
        System.out.println(findIndexOfNumberInArray(array, searchNumber));
    }

    private static int findIndexOfNumberInArray(int[] array, int searchNumber){
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex){
            int middleIndex = (startIndex + endIndex)/2;
            if (array[middleIndex] == searchNumber){
                return middleIndex;
            } else if (searchNumber < array[middleIndex]){
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
