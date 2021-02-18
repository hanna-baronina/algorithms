package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberFinderTest {
    @Test
    public void input(){
        int index = 0;
        Assert.assertEquals(0,FibonacciNumberFinder.getFibonacciNumberByIndex(index));
    }

    @Test
    public void input1(){
        int index = 1;
        Assert.assertEquals(1,FibonacciNumberFinder.getFibonacciNumberByIndex(index));
    }

    @Test
    public void input2(){
        int index = 5;
        Assert.assertEquals(5,FibonacciNumberFinder.getFibonacciNumberByIndex(index));
    }

    @Test
    public void input3(){
        int index = 7;
        Assert.assertEquals(13,FibonacciNumberFinder.getFibonacciNumberByIndex(index));
    }
}
