package challenges;

import org.junit.Assert;
import org.junit.Test;

public class TwoArraysMergerTest {
    @Test
    public void inputDifferentSizeArrays(){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6,7};
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(result,TwoArraysMerger.mergeTwoArrays(arr1, arr2));
    }

    @Test
    public void inputArraysWithSimilarNumbers(){
        int[] arr1 = {1,3,5};
        int[] arr2 = {1,2,3,};
        int[] result = {1, 1, 2, 3, 3, 5};
        Assert.assertArrayEquals(result,TwoArraysMerger.mergeTwoArrays(arr1, arr2));
    }
}
