package challenges;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberBetweenTwoArraysTest {
    @Test
    public void inputLastNumberMissing(){
        int[] givenArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5,6};
        Assert.assertEquals(6,MissingNumberBetweenTwoArrays.getMissingNumber(givenArray, expectedArray));
    }

    @Test
    public void inputFirstNumberMissing(){
        int[] givenArray = {2,3,4,5};
        int[] expectedArray = {1,2,3,4,5,6};
        Assert.assertEquals(1,MissingNumberBetweenTwoArrays.getMissingNumber(givenArray, expectedArray));
    }

    @Test
    public void inputNotSortedArray(){
        int[] givenArray = {2,3,4,5};
        int[] expectedArray = {1,2,3,4,5,6};
        Assert.assertEquals(1,MissingNumberBetweenTwoArrays.getMissingNumber(givenArray, expectedArray));
    }

}
