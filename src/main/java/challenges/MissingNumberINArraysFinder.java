package challenges;

public class MissingNumberINArraysFinder {
    public static void main(String[] args) {
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] givenArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(getMissingNumber(expectedArray, givenArray));
    }

    public static int getMissingNumber(int[] expectedArray, int[] givenArray) {
        int expectedArrayIndex = 0;
        int givenArrayIndex = 0;

        while (expectedArrayIndex < expectedArray.length || givenArrayIndex < givenArray.length) {
            if (givenArrayIndex == givenArray.length) {
                return expectedArray[expectedArrayIndex];
            } else if (givenArray[givenArrayIndex] == expectedArray[expectedArrayIndex]) {
                expectedArrayIndex++;
                givenArrayIndex++;
            } else if (givenArray[givenArrayIndex] > expectedArray[expectedArrayIndex]) {
                return expectedArray[expectedArrayIndex];
            }
        }
        return -1;
    }
}
