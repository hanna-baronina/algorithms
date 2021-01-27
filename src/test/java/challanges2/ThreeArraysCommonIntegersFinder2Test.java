package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class ThreeArraysCommonIntegersFinder2Test {
    @Test
    public void input(){
        int[] array1 = {1,2};
        int[] array2 = {3};
        int[] array3 = {4};
        Integer[] result = {};
        Assert.assertArrayEquals(result,ThreeArraysCommonIntegersFinder2.getCommonIntegers(array1, array2, array3));
    }
    @Test
    public void input2(){
        int[] array1 = {1,2};
        int[] array2 = {1,3};
        int[] array3 = {1};
        Integer[] result = {1};
        Assert.assertArrayEquals(result,ThreeArraysCommonIntegersFinder2.getCommonIntegers(array1, array2, array3));
    }

    @Test
    public void input3(){
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,3};
        Integer[] result = {1,3};
        Assert.assertArrayEquals(result,ThreeArraysCommonIntegersFinder2.getCommonIntegers(array1, array2, array3));
    }
}
