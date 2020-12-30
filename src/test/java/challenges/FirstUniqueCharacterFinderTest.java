package challenges;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterFinderTest {
    @Test
    public void input(){
        String word = "gibblegabbler";
        Assert.assertEquals("i", FirstUniqueCharacterFinder.findFirstUnique(word));
    }

    @Test
    public void input1(){
        String word = "ggggggg";
        Assert.assertEquals("", FirstUniqueCharacterFinder.findFirstUnique(word));

    }
}
