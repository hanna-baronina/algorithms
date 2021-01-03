package challenges;

import org.junit.Assert;
import org.junit.Test;

public class MaxCharacterAppearanceFinderTest {
    @Test
    public void input() {
        String word = "aaab";
        Assert.assertEquals('a', MaxCharacterAppearanceFinder.getMaxAppearanceChar(word));
    }

    @Test
    public void input1() {
        String word = "aaab bbb";
        Assert.assertEquals('b', MaxCharacterAppearanceFinder.getMaxAppearanceChar(word));
    }

    @Test
    public void input2() {
        String word = "yyb klm";
        Assert.assertEquals('y', MaxCharacterAppearanceFinder.getMaxAppearanceChar(word));
    }
}
