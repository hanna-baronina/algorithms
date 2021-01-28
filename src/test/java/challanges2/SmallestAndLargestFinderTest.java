package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class SmallestAndLargestFinderTest {
    @Test
    public void input1() {
        int[] array = {0, 1, 2, 3};
        Assert.assertEquals(3, SmallestAndLargestFinder.getDifferenceBetweenLargestAndSmallest(array));
    }

    @Test
    public void input2() {
        int[] array = {1,2,3,-1,8};
        Assert.assertEquals(9, SmallestAndLargestFinder.getDifferenceBetweenLargestAndSmallest(array));
    }

    @Test
    public void input3() {
        int[] array = {0,1};
        Assert.assertEquals(1, SmallestAndLargestFinder.getDifferenceBetweenLargestAndSmallest(array));
    }
}
