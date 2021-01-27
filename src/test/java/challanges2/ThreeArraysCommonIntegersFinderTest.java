package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class ThreeArraysCommonIntegersFinderTest {
    @Test
    public void input(){
        int[] array1 = {1,2};
        int[] array2 = {3};
        int[] array3 = {4};
        Assert.assertEquals(-1,ThreeArraysCommonIntegersFinder.findCommonInteger(array1, array2, array3));
    }
    @Test
    public void input2(){
        int[] array1 = {1,2};
        int[] array2 = {1,3};
        int[] array3 = {1};
        Assert.assertEquals(1,ThreeArraysCommonIntegersFinder.findCommonInteger(array1, array2, array3));
    }

    @Test
    public void input3(){
        int[] array1 = {1,2,3};
        int[] array2 = {2,3};
        int[] array3 = {3};
        Assert.assertEquals(3,ThreeArraysCommonIntegersFinder.findCommonInteger(array1, array2, array3));
    }
}
