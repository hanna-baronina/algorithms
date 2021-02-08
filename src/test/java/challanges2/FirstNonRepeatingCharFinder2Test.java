package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingCharFinder2Test {
    @Test
    public void input(){
        String str = "is it your first company";
        Assert.assertEquals('u',FirstNonRepeatingCharFinder2.getFirstNonRepeatingChar(str));
    }
    @Test
    public void input2(){
        String str = "Is it your first company";
        Assert.assertEquals('u',FirstNonRepeatingCharFinder2.getFirstNonRepeatingChar(str));
    }
    @Test
    public void input3(){
        String str = "yo company ";
        Assert.assertEquals('c',FirstNonRepeatingCharFinder2.getFirstNonRepeatingChar(str));
    }
}
