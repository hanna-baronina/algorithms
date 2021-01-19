package challenges;

public class LostNumberFinder {
    public static void main (String[] args){
        int[] array1 = {2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(findLostNumber(array1, array2));

    }

    public static int findLostNumber(int[] array1, int[] array2){
        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < array1.length || secondIndex < array2.length){
            if(firstIndex < array1.length && secondIndex < array2.length){
                if(array1[firstIndex] == array2[secondIndex]) {
                    firstIndex++;
                    secondIndex++;
                } else if (array1[firstIndex] < array2[secondIndex]){
                    return array1[firstIndex];
                } else {
                    return array2[secondIndex];
                }
            } else if (secondIndex == array2.length) {
                return array1[firstIndex];
            } else {
                return array2[secondIndex];
            }
        }
        return -1;
    }
}
