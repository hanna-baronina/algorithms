package challanges2;

public class AllCombinationsEqualToSumFinder {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 4, 9};
        int targetSum = 10;
        getAllCombinations(array, targetSum);
    }

    public static void getAllCombinations(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int n = 0; n < array.length; n++) {
                        if (i != j && i != k && i != n && j != k && j != n && k != n) {
                            if (array[i] + array[j] + array[k] + array[n] == targetSum) {
                                System.out.println(array[i] + "," + array[j] + "," + array[k] + "," + array[n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
