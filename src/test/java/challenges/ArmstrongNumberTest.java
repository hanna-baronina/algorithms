package challenges;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumberTest {

    @Test
    public void input0Test(){
        Assert.assertTrue(ArmstrongNumber.isArmstrongNumber(0));
    }

    @Test
    public void input1Test(){
        Assert.assertTrue(ArmstrongNumber.isArmstrongNumber(1));
    }

    @Test
    public void inputThreeDigitArmstrongNumberTest(){
        Assert.assertTrue(ArmstrongNumber.isArmstrongNumber(153));
    }

    @Test
    public void inputNotArmstrongNumberTest(){
        Assert.assertFalse(ArmstrongNumber.isArmstrongNumber(156));
    }
}
