package challenges;


public class CommonIntegersInArraysFinder {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 4};
        int[] array2 = {3, 1, 7, 3};
        getCommonIntegers(array1, array2);
    }

    public static void getCommonIntegers(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
