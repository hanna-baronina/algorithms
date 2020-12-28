package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestUniqueSubArrayFinderTest3 {
    @Test
    public void input(){
        int[] array = {2, 7, 3, 4, 7, 9, 2, 6, 3};
        int[] expectedResult = {3, 4, 7, 9, 2, 6};
        Assert.assertArrayEquals(expectedResult, LongestUniqueSubArrayFinder3.getLongestUniqueSubArray(array));
    }
    @Test
    public void input1(){
        int[] array = {1, 2, 1};
        int[] expectedResult = {1, 2};
        Assert.assertArrayEquals(expectedResult, LongestUniqueSubArrayFinder3.getLongestUniqueSubArray(array));
    }

    @Test
    public void input2(){
        int[] array = {1, 1, 1, 2};
        int[] expectedResult = {1, 2};
        Assert.assertArrayEquals(expectedResult, LongestUniqueSubArrayFinder3.getLongestUniqueSubArray(array));
    }

    @Test
    public void input3(){
        int[] array = {1, 1, 1, 2, 1, 1, 1};
        int[] expectedResult = {1, 2};
        Assert.assertArrayEquals(expectedResult, LongestUniqueSubArrayFinder3.getLongestUniqueSubArray(array));
    }
}
