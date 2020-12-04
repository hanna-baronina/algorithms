package challenges;


public class ArrayRecursivePrinter {
    public static void printArray(int[] array, int i) {
        if (i == array.length){
           return;
        }

        System.out.println(array[i]);
        i++;
        printArray(array, i);
    }
}
