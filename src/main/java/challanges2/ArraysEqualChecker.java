package challanges2;

public class ArraysEqualChecker {
    public static void main (String[] args){
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        System.out.println(checkIfArraysEqual(array1, array2));
    }

    public static boolean checkIfArraysEqual(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
