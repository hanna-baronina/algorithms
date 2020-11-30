package challenges;

import org.junit.Assert;
import org.junit.Test;

public class NumberReverserTest {
    @Test
    public void input0Test(){
        Assert.assertEquals(0, NumberReverser.reverseNumber(0));
    }

    @Test
    public void inputTwoDigitTest(){
        Assert.assertEquals(21, NumberReverser.reverseNumber(12));
    }
    @Test
    public void inputThreeDigitTest(){
        Assert.assertEquals(321, NumberReverser.reverseNumber(123));
    }

    @Test
    public void inputFourDigitTest(){
        Assert.assertEquals(4321, NumberReverser.reverseNumber(1234));
    }
}
