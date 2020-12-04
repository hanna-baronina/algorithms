package challenges;

public class ArrayRecursiveSumCounter {
    public static int calcArraySumRecursevly(int i, int[] array) {
        if(i == array.length -1){
            return array[i];
        }
        return array[i] + calcArraySumRecursevly(i + 1, array);
    }
}
