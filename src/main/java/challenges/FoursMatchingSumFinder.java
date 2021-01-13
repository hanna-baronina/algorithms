package challenges;

public class FoursMatchingSumFinder {
    public static void main (String [] args){
        int[] array = {1,2,3,4,5};
        int givenNumber = 6;
        findFoursMatchingSum(array, givenNumber);
    }

    public static void findFoursMatchingSum (int[] array, int givenNumber){
        for(int i = 0; i <= array.length - 4; i++){
            for(int j = i + 1; j <= array.length - 3; j++){
                for(int k = j + 1; k <= array.length - 2; k++){
                    for(int m = k + 1; m < array.length; m++){
                        System.out.println(array[i] + "," + array[j] + "," + array[k] + "," +  array[m]);
                    }
                }
            }
        }
    }
}
