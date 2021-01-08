package challenges;

public class NumberOfOccurrencesCounter {
    public static void main (String[] args){
        int[] array = {3,5,2,3};
        int number = 4;
        System.out.println(getNumberOfOccurrences(array, number));
    }

    public static int getNumberOfOccurrences(int[] array, int number ){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                count++;
            }
        }
        return count;
    }
}
