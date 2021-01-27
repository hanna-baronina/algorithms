package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberSortedArrayFinderTest {
    @Test
    public void input(){
        int[] array = {2,3,4,5,6};
        Assert.assertEquals(1,MissingNumberSortedArrayFinder.findMissingNumber(array));
    }
    @Test
    public void input2(){
        int[] array = {2,3,5,6};
        Assert.assertEquals(4,MissingNumberSortedArrayFinder.findMissingNumber(array));
    }

    @Test
    public void input3(){
        int[] array = {1,2};
        Assert.assertEquals(0,MissingNumberSortedArrayFinder.findMissingNumber(array));
    }
}
