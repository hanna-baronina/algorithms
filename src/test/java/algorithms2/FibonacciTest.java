package algorithms2;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test0Input(){
        Assert.assertEquals(0, FibonacciIterative.getFibonacci(0));
    }

    @Test
    public void test1Input(){
        Assert.assertEquals(1, FibonacciIterative.getFibonacci(1));
    }

    @Test
    public void test7Input(){
        Assert.assertEquals(13, FibonacciIterative.getFibonacci(7));
    }
}
