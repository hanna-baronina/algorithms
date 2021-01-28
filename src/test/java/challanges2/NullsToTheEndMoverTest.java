package challanges2;

        import org.junit.Assert;
        import org.junit.Test;

public class NullsToTheEndMoverTest {
    @Test
    public void input1() {
        int[] array = {0, 0, 1, 2, 3, 0};
        int[] result = {1, 2, 3, 0, 0, 0};
        Assert.assertArrayEquals(result, NullsToTheEndMover.moveNullsToTheEnd(array));
    }

    @Test
    public void input2() {
        int[] array = {-11, 0, 0, 2, 3, 0};
        int[] result = {-11, 2, 3, 0, 0, 0};
        Assert.assertArrayEquals(result, NullsToTheEndMover.moveNullsToTheEnd(array));
    }

    @Test
    public void input3() {
        int[] array = {0};
        int[] result = {0};
        Assert.assertArrayEquals(result, NullsToTheEndMover.moveNullsToTheEnd(array));
    }
    @Test
    public void input4() {
        int[] array = {0,1};
        int[] result = {1,0};
        Assert.assertArrayEquals(result, NullsToTheEndMover.moveNullsToTheEnd(array));
    }
}
