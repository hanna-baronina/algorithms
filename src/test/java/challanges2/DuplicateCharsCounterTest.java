package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateCharsCounterTest {
    @Test
    public void input(){
        String str = "acbbbbcdd";
        Assert.assertEquals(3,DuplicateCharsCounter.countDuplicateChars(str));
    }
    @Test
    public void input2(){
        String str = "acbd";
        Assert.assertEquals(0,DuplicateCharsCounter.countDuplicateChars(str));
    }

    @Test
    public void input3(){
        String str = "acbdB";
        Assert.assertEquals(1,DuplicateCharsCounter.countDuplicateChars(str));
    }
}
