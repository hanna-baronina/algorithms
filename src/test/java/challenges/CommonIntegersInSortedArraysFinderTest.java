package challenges;

import org.junit.Assert;
import org.junit.Test;

public class CommonIntegersInSortedArraysFinderTest {

    @Test
    public void inputSameArrays(){
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,2,3};
        Integer[] result = {1,2,3};

        Assert.assertArrayEquals(result, CommonIntegersInSortedArraysFinder.getCommonIntegers(
                firstArray, secondArray));
    }

    @Test
    public void inputDifferentLengthArrays(){
        int[] firstArray = {1,2,4,5};
        int[] secondArray = {1,2,3};
        Integer[] result = {1,2};

        Assert.assertArrayEquals(result, CommonIntegersInSortedArraysFinder.getCommonIntegers(
                firstArray, secondArray));
    }

    @Test
    public void inputDifferentArrays(){
        int[] firstArray = {1,2,4,5};
        int[] secondArray = {6,7,8};
        Integer[] result = {};

        Assert.assertArrayEquals(result, CommonIntegersInSortedArraysFinder.getCommonIntegers(
                firstArray, secondArray));
    }

    @Test
    public void inputEmptyArray(){
        int[] firstArray = {1,2,4,5};
        int[] secondArray = {};
        Integer[] result = {};

        Assert.assertArrayEquals(result, CommonIntegersInSortedArraysFinder.getCommonIntegers(
                firstArray, secondArray));
    }
}
