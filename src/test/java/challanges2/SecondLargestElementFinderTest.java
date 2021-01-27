package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestElementFinderTest {

    @Test
    public void input(){
        int[] array = {2,4,8,7,5,9};
        Assert.assertEquals(8,SecondLargestElementFinder.getSecondLargest(array));
    }
    @Test
    public void input2(){
        int[] array = {2};
        Assert.assertEquals(-1,SecondLargestElementFinder.getSecondLargest(array));
    }

    @Test
    public void input3(){
        int[] array = {4,4,2,3,1};
        Assert.assertEquals(3,SecondLargestElementFinder.getSecondLargest(array));
    }
}
