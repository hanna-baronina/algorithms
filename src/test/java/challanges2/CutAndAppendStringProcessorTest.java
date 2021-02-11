package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class CutAndAppendStringProcessorTest {
    @Test
    public void input(){
        String str = "welcome";
        String str2 = "home";
        String result = "comehome";
        Assert.assertEquals(result, CutAndAppendStringProcessor.cutAndAppend(str, str2));
    }
    @Test
    public void input1(){
        String str = "home";
        String str2 = "welcome";
        String result = "homecome";
        Assert.assertEquals(result, CutAndAppendStringProcessor.cutAndAppend(str, str2));
    }

    @Test
    public void input2(){
        String str = "test";
        String str2 = "desk";
        String result = "testdesk";
        Assert.assertEquals(result, CutAndAppendStringProcessor.cutAndAppend(str, str2));
    }
}
