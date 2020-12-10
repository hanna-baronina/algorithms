package challenges;

import org.junit.Assert;
import org.junit.Test;

public class BinaryArraySorterTest {

    @Test
    public void inputFirstPositionOneArray(){
        int[] array = {1,0,0};
        Assert.assertArrayEquals(new int[]{1,0,0},BinaryArraySorter.sortBinaryArray(array));
    }

    @Test
    public void inputLastPositionOneArray(){
        int[] array = {0,0,1};
        Assert.assertArrayEquals(new int[]{1,0,0},BinaryArraySorter.sortBinaryArray(array));
    }

    @Test
    public void inputNullsArray(){
        int[] array = {0,0,0};
        Assert.assertArrayEquals(new int[]{0,0,0},BinaryArraySorter.sortBinaryArray(array));
    }

    @Test
    public void inputOnesArray(){
        int[] array = {1,1,1};
        Assert.assertArrayEquals(new int[]{1,1,1},BinaryArraySorter.sortBinaryArray(array));
    }
}
