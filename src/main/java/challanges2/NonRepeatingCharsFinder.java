package challanges2;

public class NonRepeatingCharsFinder {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'b'};
        getNonRepeatingChar(array);
    }

    public static void getNonRepeatingChar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicate = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        hasDuplicate = true;
                    }
                }
            }
            if (!hasDuplicate) {
                System.out.println(array[i]);
            }
        }
    }
}
