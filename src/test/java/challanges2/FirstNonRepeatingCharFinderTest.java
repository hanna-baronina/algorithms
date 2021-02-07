package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingCharFinderTest {
    @Test
    public void input(){
        String str = "gibblegabbler";
        Assert.assertEquals('i',FirstNonRepeatingCharFinder.getFirstNonRepeatingChar(str));
    }
    @Test
    public void input2(){
        String str = "gbblegabblery";
        Assert.assertEquals('a',FirstNonRepeatingCharFinder.getFirstNonRepeatingChar(str));
    }
    @Test
    public void input3(){
        String str = "gbblegbblea";
        Assert.assertEquals('a',FirstNonRepeatingCharFinder.getFirstNonRepeatingChar(str));
    }
    @Test
    public void input4(){
        String str = "gbblegbble";
        Assert.assertEquals(' ',FirstNonRepeatingCharFinder.getFirstNonRepeatingChar(str));
    }
}
