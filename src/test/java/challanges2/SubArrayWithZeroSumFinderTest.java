package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayWithZeroSumFinderTest {
    @Test
    public void input() {
        int[] array = {1, 0, 2, 5, 4, 2, 3};
        Assert.assertFalse(SubArrayWithZeroSumFinder.hasSubArrayWithZeroSum(array));
    }

    @Test
    public void input1() {
        int[] array = {1, 2, -2, 3, 4, 5, 6};
        Assert.assertTrue(SubArrayWithZeroSumFinder.hasSubArrayWithZeroSum(array));
    }

    @Test
    public void input2() {
        int[] array = {1, 0, 4, 2, 3, -2, -3};
        Assert.assertTrue(SubArrayWithZeroSumFinder.hasSubArrayWithZeroSum(array));
    }

}
