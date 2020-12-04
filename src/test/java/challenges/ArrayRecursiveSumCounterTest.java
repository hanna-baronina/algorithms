package challenges;

import org.junit.Assert;
import org.junit.Test;

public class ArrayRecursiveSumCounterTest {
    @Test
    public void test() {
        Assert.assertEquals(6,ArrayRecursiveSumCounter.calcArraySumRecursevly(0, new int[] {1,2,3}));
    }
}
