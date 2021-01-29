package challanges2;

public class AllUniqueTripletsMatchingSumFinder {
    public static void main (String[] args){
        int[] array = {1, -2, 0, 5, -1, -4};
        int targetSum = 2;
        getUniqueTripletsMatchingSum(array, targetSum);
    }

    public static void getUniqueTripletsMatchingSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == targetSum) {
                        System.out.println(array[i] + "," + array[j] + "," + array[k]);
                    }
                }
            }
        }
    }
}
