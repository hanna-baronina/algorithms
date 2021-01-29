package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveElementsInUnsortedArrayFinderTest {
    @Test
    public void  input(){
        int[] array = {49,1,3,200,2,4,70,71,72,73,74,75,76};
        Assert.assertEquals(7,LongestConsecutiveElementsInUnsortedArrayFinder.getLongestConsecutiveElements(array));
    }

    @Test
    public void  input1(){
        int[] array = {49,1,3,};
        Assert.assertEquals(1,LongestConsecutiveElementsInUnsortedArrayFinder.getLongestConsecutiveElements(array));
    }

    @Test
    public void  input2(){
        int[] array = {49,-1,0,1,3,};
        Assert.assertEquals(3,LongestConsecutiveElementsInUnsortedArrayFinder.getLongestConsecutiveElements(array));
    }
}
