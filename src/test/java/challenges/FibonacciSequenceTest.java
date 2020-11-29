package challenges;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {

    @Test
    public void test0Input(){
        Assert.assertEquals("0",FibonacciSequence.getFibonacciSequence(0));
    }

    @Test
    public void test1Input(){
        Assert.assertEquals("01", FibonacciSequence.getFibonacciSequence(1));
    }

    @Test
    public void test5Input(){
        Assert.assertEquals("011235", FibonacciSequence.getFibonacciSequence(5));
    }
}
