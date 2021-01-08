package challenges;

import org.junit.Assert;
import org.junit.Test;

public class TwoOrderedListsMergerTest {
    @Test
    public void input1(){
        int[] array1 = {1,2,4,6,7,0,0,0};
        int[] array2 = {2,3,5};
        int[] expectedArray = {1,2,2,3,4,5,6,7};
        Assert.assertArrayEquals(expectedArray,TwoOrderedListsMerger.mergeTwoLists(array1, array2));
    }

    @Test
    public void input2(){
        int[] array1 = {1,2,3,4,5,0,0,0};
        int[] array2 = {6,7,8};
        int[] expectedArray = {1,2,3,4,5,6,7,8};
        Assert.assertArrayEquals(expectedArray,TwoOrderedListsMerger.mergeTwoLists(array1, array2));
    }

    @Test
    public void input3(){
        int[] array1 = {4,5,6,7,8,0,0,0};
        int[] array2 = {1,2,3};
        int[] expectedArray = {1,2,3,4,5,6,7,8};
        Assert.assertArrayEquals(expectedArray,TwoOrderedListsMerger.mergeTwoLists(array1, array2));
    }
}
