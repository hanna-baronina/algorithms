package challenges;

public class ElementSumEqualsToGivenNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 2, 3, 4, 2};
        int number = 4;
        getNumbers(number, array);
    }

    public static void getNumbers(int number, int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == number){
                    System.out.println(array[i] + ":" + array[j]) ;
                }
            }
        }
    }
}
