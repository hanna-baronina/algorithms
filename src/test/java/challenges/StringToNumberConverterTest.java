package challenges;

import org.junit.Assert;
import org.junit.Test;

public class StringToNumberConverterTest {

    @Test
    public void input0Test(){
        Assert.assertEquals(0, StringToNumberConverter.convertStringToNumber("0"));
    }

    @Test
    public void inputThreeDigitWith0Test(){
        Assert.assertEquals(103, StringToNumberConverter.convertStringToNumber("103"));
    }

    @Test
    public void inputThreeDigitTest(){
        Assert.assertEquals(123, StringToNumberConverter.convertStringToNumber("123"));
    }
}
