package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class AllTenthElementsSumFinderTest {
    @Test
    public void input1() {
        int[] array = {1,10,10,1,10};
        Assert.assertTrue(AllTenthElementsSumFinder.getSumOfAllTens(array));
    }

    @Test
    public void input2() {
        int[] array = {1,10,10,1};
        Assert.assertFalse(AllTenthElementsSumFinder.getSumOfAllTens(array));
    }

    @Test
    public void input3() {
        int[] array = {1,10,10,1,10,10};
        Assert.assertFalse( AllTenthElementsSumFinder.getSumOfAllTens(array));
    }
}
