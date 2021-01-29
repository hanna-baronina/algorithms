package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class SumClosestToTheZeroFinderTest {
    @Test
    public void input() {
        int[] array = {2, 1, 0, -3};
        int[] result = {2, -3};
        Assert.assertArrayEquals(result, SumClosestToTheZeroFinder.getSumClosestToZero(array));
    }

    @Test
    public void input1() {
        int[] array = {2, 1, 0, -4};
        int[] result = {1, 0};
        Assert.assertArrayEquals(result, SumClosestToTheZeroFinder.getSumClosestToZero(array));
    }

    @Test
    public void input2() {
        int[] array = {2, -2, 1, 0, -3};
        int[] result = {2, -2};
        Assert.assertArrayEquals(result, SumClosestToTheZeroFinder.getSumClosestToZero(array));
    }
}
