package challenges;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedArraysTest {

    @Test
    public void inputSimilarLengthArrays(){
        Assert.assertArrayEquals(new int[] {1,2},MergeTwoArrays.merge(new int[] {1} ,new int[] {2} ));
    }

    @Test
    public void inputFirstLongerArray(){
        Assert.assertArrayEquals(new int[] {0,3,4},MergeTwoArrays.merge(new int[] {0,4} ,new int[] {3} ));
    }

    @Test
    public void inputSecondLongerArray(){
        Assert.assertArrayEquals(new int[] {0,1,1,3,4},MergeTwoArrays.merge(new int[] {0,1} ,new int[] {1,3,4} ));
    }

    @Test
    public void inputArraysWithSimilarDigits(){
        Assert.assertArrayEquals(new int[] {2,3,3,4,9},MergeTwoArrays.merge(new int[] {3,9} ,new int[] {2,3,4} ));
    }

}
