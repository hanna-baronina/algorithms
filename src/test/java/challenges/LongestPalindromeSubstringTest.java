package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeSubstringTest {
    @Test
    public void input(){
        String word = "abccbaabc";
        Assert.assertEquals(6,LongestPalindromeSubstring2.getMaxPalindromeLength(word));
    }

    @Test
    public void input2(){
        String word = "abcdghijklmhnop";
        Assert.assertEquals(0, LongestPalindromeSubstring2.getMaxPalindromeLength(word));

    }
    @Test
    public void input3(){
        String word = "abcdghijklasusa";
        Assert.assertEquals(5, LongestPalindromeSubstring2.getMaxPalindromeLength(word));

    }

    @Test
    public void input4(){
        String word = "appppacdghijklasusa";
        Assert.assertEquals(6, LongestPalindromeSubstring2.getMaxPalindromeLength(word));

    }

    @Test
    public void input5(){
        String word = "applerelppa";
        Assert.assertEquals(11, LongestPalindromeSubstring2.getMaxPalindromeLength(word));

    }

}
