package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringOfUniqueCharactersFinderTest {
    @Test
    public void inputEmptyStringTest(){
        Assert.assertEquals("",
                LongestSubstringOfUniqueCharactersFinder.findLongestSubstring(""));
    }

    @Test
    public void inputStringWitheDuplicatesTest(){
        Assert.assertEquals("abc",
                LongestSubstringOfUniqueCharactersFinder.findLongestSubstring("abcabcbb"));
    }

    @Test
    public void inputStringWithOneLetterDuplicatesTest(){
        Assert.assertEquals("b",
                LongestSubstringOfUniqueCharactersFinder.findLongestSubstring("bbbbb"));
    }

    @Test
    public void inputUniqueCharacterInTheMiddleTest(){
        Assert.assertEquals("wke",
                LongestSubstringOfUniqueCharactersFinder.findLongestSubstring("pwwkew"));
    }

}

