package challenges;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberFinderTest {

    @Test
    public void inputNotSortedArray(){
        int[] array = {1,6,4,5,2};
        Assert.assertEquals(3, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void inputArrayFirstMissing(){
        int[] array = {3,4,6,2,5};
        Assert.assertEquals(1, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void inputWithLastMissingMissing(){
        int[] array = {1,3,4,5,2};
        Assert.assertEquals(6 , MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void inputNotSortedArray2(){
        int[] array = {1,6,4,5,2};
        Assert.assertEquals(3, MissingNumberFinder.findMissingNumber2(array));
    }

    @Test
    public void inputArrayWithMissing2(){
        int[] array = {1,3,4,6,2};
        Assert.assertEquals(5, MissingNumberFinder.findMissingNumber2(array));
    }

    @Test
    public void inputWithLastMissingMissing2(){
        int[] array = {1,3,4,5,2};
        Assert.assertEquals( 6, MissingNumberFinder.findMissingNumber2(array));
    }

}
