package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestUniqueSubArrayFinderTest {
    @Test
    public void input(){
        int[] array = {2, 7, 3, 4, 7, 9, 2, 6, 3};
        Assert.assertEquals(6,LongestUniqueSubArrayFinder.getLongestUniqueSubArray(array));
    }
    @Test
    public void input1(){
        int[] array = {1, 2, 1};
        Assert.assertEquals(2,LongestUniqueSubArrayFinder.getLongestUniqueSubArray(array));
    }

    @Test
    public void input2(){
        int[] array = {1, 1, 1, 2};
        Assert.assertEquals(2,LongestUniqueSubArrayFinder.getLongestUniqueSubArray(array));
    }

    @Test
    public void input3(){
        int[] array = {1, 1, 1, 2, 1, 1, 1};
        Assert.assertEquals(2,LongestUniqueSubArrayFinder.getLongestUniqueSubArray(array));
    }

}
