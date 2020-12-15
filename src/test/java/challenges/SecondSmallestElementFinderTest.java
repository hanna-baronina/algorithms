package challenges;

import org.junit.Assert;
import org.junit.Test;

public class SecondSmallestElementFinderTest {
    @Test
    public void inputArraySeveralSmallestNumbers(){
        int[] array = {1,5,1,2,4};
        Assert.assertEquals(2,SecondSmallestElementFinder.getSecondSmallest(array));
    }

    @Test
    public void inputArrayWithSeveralSmallestNumbers(){
        int[] array = {1,5,2,2,4};
        Assert.assertEquals(2,SecondSmallestElementFinder.getSecondSmallest(array));
    }
}
