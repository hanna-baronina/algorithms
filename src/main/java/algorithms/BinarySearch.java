package algorithms;

public class BinarySearch {
    public static void main (String [] args){
        int[] array = {1,3,4,5,7,8,11,15};
        int searchNumber = 28;
        int startIndex = 0;
        int endIndex = array.length - 1;
        int result = -1;

        while(startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex) / 2;
            if (array[middleIndex] == searchNumber) {
                result = middleIndex;
                break;
            }
            if (array[middleIndex] > searchNumber) {
                endIndex = middleIndex - 1;
            }
            if (array[middleIndex] < searchNumber) {
                startIndex = middleIndex + 1;
            }
        }
        System.out.println(result);
    }
}
