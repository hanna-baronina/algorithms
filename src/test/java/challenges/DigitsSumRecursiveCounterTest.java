package challenges;

import org.junit.Assert;
import org.junit.Test;

public class DigitsSumRecursiveCounterTest {
    @Test
    public void input0Test(){
        Assert.assertEquals(0, DigitsSumRecursiveCounter.calculateSum(0));
    }

    @Test
    public void inputNumberTest(){
        Assert.assertEquals(6, DigitsSumRecursiveCounter.calculateSum(123));
    }
}
