package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringOfUniqueCharsFinder2Test {
    @Test
    public void input(){
        String word = "pickoutthelongestsubstring";
        Assert.assertEquals(8, LongestSubstringOfUniqueCharsFinder2.getLengthOfUniqueCharacters(word));
    }

    @Test
    public void input1(){
        String word = "aaaoaaa";
        Assert.assertEquals(2, LongestSubstringOfUniqueCharsFinder2.getLengthOfUniqueCharacters(word));
    }

    @Test
    public void input2(){
        String word = "aaaaaaa";
        char[] expectedResult = {'a'};
        Assert.assertEquals(1 ,LongestSubstringOfUniqueCharsFinder2.getLengthOfUniqueCharacters(word));
    }
}
