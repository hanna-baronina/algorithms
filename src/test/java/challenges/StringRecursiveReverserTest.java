package challenges;

import org.junit.Assert;
import org.junit.Test;

public class StringRecursiveReverserTest {

    @Test
    public void inputEmptyString(){
        String word = "";
        Assert.assertEquals("", StringRecursiveReverser.reverse(word));
    }

    @Test
    public void inputString(){
        String word = "abcd";
        Assert.assertEquals("dcba", StringRecursiveReverser.reverse(word));
    }
}
