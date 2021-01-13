package challenges;

public class AllSubArraysPrinter2 {
    public static void main (String[] args){
        int[] array = {1,2,3,4};
        printAllTripleSubArrays(array);
    }

    public static void printAllTripleSubArrays(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                for(int k = 0; k < array.length; k++){
                    if(k != i && k != j && j != i) {
                        System.out.println(array[i] + "," + array[j] + "," + array[k]);
                    }
                }
            }
        }
    }
}
