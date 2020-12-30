package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringOfUniqueCharsFinderTest {
    @Test
    public void input(){
        String word = "pickoutthelongestsubstring";
        char[] expectedResult = {'u','b','s','t', 'r', 'i', 'n', 'g'};
        Assert.assertArrayEquals(expectedResult, LongestSubstringOfUniqueCharsFinder.getLongestUniqueCharacters(word));
    }

    @Test
    public void input1(){
        String word = "aaaoaaa";
        char[] expectedResult = {'a','o'};
        Assert.assertArrayEquals(expectedResult, LongestSubstringOfUniqueCharsFinder.getLongestUniqueCharacters(word));
    }

    @Test
    public void input2(){
        String word = "aaaaaaa";
        char[] expectedResult = {'a'};
        Assert.assertArrayEquals(expectedResult, LongestSubstringOfUniqueCharsFinder.getLongestUniqueCharacters(word));
    }

}
