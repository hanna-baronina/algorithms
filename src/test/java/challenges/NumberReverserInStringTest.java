package challenges;

import org.junit.Assert;
import org.junit.Test;

public class NumberReverserInStringTest {
    @Test
    public void input0Test(){
        Assert.assertEquals("0", NumberInStringFormatReverser.reverseNumber(0));
    }

    @Test
    public void inputTwoDigitTest(){
        Assert.assertEquals("21", NumberInStringFormatReverser.reverseNumber(12));
    }
    @Test
    public void inputThreeDigitTest(){
        Assert.assertEquals("321", NumberInStringFormatReverser.reverseNumber(123));
    }

    @Test
    public void inputFourDigitTest(){
        Assert.assertEquals("4321", NumberInStringFormatReverser.reverseNumber(1234));
    }
}
