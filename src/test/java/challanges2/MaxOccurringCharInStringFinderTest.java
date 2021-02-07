package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class MaxOccurringCharInStringFinderTest {
    @Test
    public void input(){
        String str = "test string";
        Assert.assertEquals('t',MaxOccurringCharInStringFinder.getMaxOccurringChar(str));
    }
    @Test
    public void input2(){
        String str = "tesla";
        Assert.assertEquals(' ',MaxOccurringCharInStringFinder.getMaxOccurringChar(str));
    }

    @Test
    public void input3(){
        String str = "test strintss";
        Assert.assertEquals('s',MaxOccurringCharInStringFinder.getMaxOccurringChar(str));
    }
}
