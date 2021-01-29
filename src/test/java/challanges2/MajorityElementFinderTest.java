package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementFinderTest {
    @Test
    public void input(){
        int[] array = {2,3,5};
        Assert.assertEquals(-1,MajorityElementFinder.findMajorityElement(array));
    }

    @Test
    public void input2(){
        int[] array = {2,3,5,3};
        Assert.assertEquals(3,MajorityElementFinder.findMajorityElement(array));
    }

    @Test
    public void input3(){
        int[] array = {2,3,5,3,3,5,5};
        Assert.assertEquals(3,MajorityElementFinder.findMajorityElement(array));
    }
}
