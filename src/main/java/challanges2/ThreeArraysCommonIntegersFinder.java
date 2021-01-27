package challanges2;

public class ThreeArraysCommonIntegersFinder {
    public static void main (String[] args){
        int[] array1 = {1,2};
        int[] array2 = {3};
        int[] array3 = {4};
        System.out.println(findCommonInteger(array1, array2, array3));
    }

    public static int findCommonInteger(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    for (int k = 0; k < array3.length; k++) {
                        if (array1[i] == array3[k]) {
                            return array1[i];
                        }
                    }
                }
            }
        }
        return -1;
    }
}
