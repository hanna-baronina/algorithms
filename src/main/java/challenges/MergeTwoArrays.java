package challenges;

public class MergeTwoArrays {
    public static int[] merge(int[] array1, int[] array2) {
        int index1 = 0;
        int index2 = 0;
        int[] array3 = new int[array1.length + array2.length];
        int index3 = 0;

        while (index1 < array1.length || index2 < array2.length) {
            if (index1 < array1.length && index2 < array2.length) {
                if (array1[index1] <= array2[index2]){
                    array3[index3] = array1[index1];
                    index3++;
                    index1++;
                } else {
                    array3[index3] = array2[index2];
                    index3++;
                    index2++;
                }
            }
            if (index1 == array1.length && index2 < array2.length) {
                array3[index3] = array2[index2];
                index3++;
                index2++;
            }
            if (index2 == array2.length && index1 < array1.length) {
                array3[index3] = array1[index1];
                index3++;
                index1++;
            }

        }
        return array3;
    }
}
