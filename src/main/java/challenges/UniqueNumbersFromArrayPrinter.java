package challenges;

public class UniqueNumbersFromArrayPrinter {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 7, 7};
        printUniqueNumbersFromArray(array);
    }

    public static void printUniqueNumbersFromArray(int[] array) {
        int writeIndex = 0;

        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicate = false;
            for (int j = 0; j < writeIndex; j++) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (!hasDuplicate) {
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        for (int p = 0; p < writeIndex; p++) {
            System.out.println(array[p]);
        }
    }
}
