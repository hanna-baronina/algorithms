package challenges;

import org.junit.Assert;
import org.junit.Test;

public class MaxSumFinderTest {
    @Test
    public void input() {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        Assert.assertEquals(7, MaxSumFinder.getMaxSum(array));
    }
}
