package challenges;

import org.junit.Assert;
import org.junit.Test;


public class NullsToEndMoverTest {
    @Test
    public void inputArrayWithNulls(){
        int[] array = {1,2,0,0,3,4};
        int[] arrayResult = {1,2,3,4,0,0};
        Assert.assertArrayEquals(arrayResult, NullsToEndMover.moveNulls(array));

    }

    @Test
    public void inputArrayWithoutNulls(){
        int[] array = {1,2,3,4};
        int[] arrayResult = {1,2,3,4};
        Assert.assertArrayEquals(arrayResult, NullsToEndMover.moveNulls(array));

    }
}
