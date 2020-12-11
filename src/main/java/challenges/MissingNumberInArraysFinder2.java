package challenges;

public class MissingNumberInArraysFinder2 {

    public static void main(String[] args) {
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] givenArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getMissingNumber(expectedArray, givenArray));
    }

    private static int getMissingNumber(int[] expectedArray, int[] givenArray) {
        for (int i = 0; i < expectedArray.length; i++) {
            boolean numberFound = false;
            for (int j = 0; j < givenArray.length; j++) {
                if (expectedArray[i] == givenArray[j]) {
                    numberFound = true;
                }
            }
            if (!numberFound) {
                return expectedArray[i];
            }
        }
        return -1;
    }
}
