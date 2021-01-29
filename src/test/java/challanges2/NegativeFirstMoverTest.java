package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class NegativeFirstMoverTest {
    @Test
    public void input(){
        int[] array = {-2,1,0,-2,-1};
        int[] result = {-2, -1, -2, 1, 0};
        Assert.assertArrayEquals(result,NegativeFirstMover.moveNegativeToTheBeginning(array));
    }

    @Test
    public void input2(){
        int[] array = {1,1,0,-2,-1};
        int[] result = {-1, -2, 0, 1, 1};
        Assert.assertArrayEquals(result,NegativeFirstMover.moveNegativeToTheBeginning(array));
    }

    @Test
    public void input3(){
        int[] array = {1,1,2,3};
        int[] result = {1,1,2,3};
        Assert.assertArrayEquals(result,NegativeFirstMover.moveNegativeToTheBeginning(array));
    }

    @Test
    public void input4(){
        int[] array = {-1,-1,-2,-3};
        int[] result = {-1,-1,-2,-3};
        Assert.assertArrayEquals(result,NegativeFirstMover.moveNegativeToTheBeginning(array));
    }

}
