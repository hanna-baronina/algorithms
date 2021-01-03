package challenges;

import org.junit.Assert;
import org.junit.Test;

public class WordsInStringReverserTest {
    @Test
    public void input() {
        String sentence = "hello world";
        Assert.assertEquals("world hello", WordsInStringReverser.reverseWords(sentence));
    }

    @Test
    public void input1() {
        String sentence = "hello  world";
        Assert.assertEquals("world hello", WordsInStringReverser.reverseWords(sentence));
    }

    @Test
    public void input2() {
        String sentence = "world";
        Assert.assertEquals("world", WordsInStringReverser.reverseWords(sentence));
    }
}
