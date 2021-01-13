package challenges;

public class FirstAndFinalOccurrenceFinder {
    public static void main (String[] args){
        int[] array = {1,2,3,4,5,5,7,8};
        int searchNumber = 5;
        printFirstAndSecondOccurrence(array, searchNumber);

    }

    public static void printFirstAndSecondOccurrence(int[] array, int searchNumber){
        for(int i = 0; i < array.length; i++){
            if(array[i] == searchNumber){
                System.out.println("First occurrence index " + i);
                break;
            }
        }

        for(int i = array.length - 1; i > 0;i-- ){
            if(array[i] == searchNumber){
                System.out.println("Final occurrence index " + i);
                break;
            }
        }
    }
}
