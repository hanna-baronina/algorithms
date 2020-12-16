package challenges;

import org.junit.Assert;
import org.junit.Test;

public class ArraysEqualityCheckerTest {
    @Test
    public void inputDifferentSizeArrays() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3};
        Assert.assertFalse(ArraysEqualityChecker.isArraysEqual(array1, array2));
    }

    @Test
    public void inputNotEqualArrays() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 0};
        Assert.assertFalse(ArraysEqualityChecker.isArraysEqual(array1, array2));
    }

    @Test
    public void inputEqualArrays() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        Assert.assertTrue(ArraysEqualityChecker.isArraysEqual(array1, array2));
    }
}
