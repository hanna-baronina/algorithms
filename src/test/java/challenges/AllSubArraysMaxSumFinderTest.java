package challenges;

import org.junit.Assert;
import org.junit.Test;

public class AllSubArraysMaxSumFinderTest {
    @Test
    public void verifyAllElementsGiveMaxSum(){
        int[] array = {1,2,3,4};
        Assert.assertEquals(10, AllSubArraysMaxSumFinder.getMaxSum(array));
    }

    @Test
    public void verifyAllElementsGiveMaxSumWithOneNegative(){
        int[] array = {1,7,-3,4};
        Assert.assertEquals(9, AllSubArraysMaxSumFinder.getMaxSum(array));
    }

    @Test
    public void verifyTwoNumbersGiveMaxSumDueToBigNegative(){
        int[] array = {1,2,-10,3};
        Assert.assertEquals(3, AllSubArraysMaxSumFinder.getMaxSum(array));
    }

    @Test
    public void verifyAllNegative(){
        int[] array = {-3, -1, -2};
        Assert.assertEquals(-1, AllSubArraysMaxSumFinder.getMaxSum(array));
    }

}
