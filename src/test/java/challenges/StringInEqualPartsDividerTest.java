package challenges;

import org.junit.Assert;
import org.junit.Test;

public class StringInEqualPartsDividerTest {
    @Test
    public void input() {
        String word = "abcdefghijklmnopqrstuvwxy";
        int n = 5;
        String[] expectedResult = {"abcde", "fghij", "klmno", "pqrst", "uvwxy"};
        Assert.assertArrayEquals(expectedResult, StringInEqualPartsDivider.divideStringEquallyOnN(word, n));
    }

    @Test
    public void input1() {
        String word = "abcdefghijklmnopqrstuvwx";
        int n = 5;
        String[] expectedResult = {"abcde", "fghij", "klmno", "pqrst", "uvwx"};
        Assert.assertArrayEquals(expectedResult, StringInEqualPartsDivider.divideStringEquallyOnN(word, n));
    }

    @Test
    public void input2() {
        String word = "abcdefghijklmnopqrstuvwx";
        int n = 1;
        String[] expectedResult = {"abcdefghijklmnopqrstuvwx"};
        Assert.assertArrayEquals(expectedResult, StringInEqualPartsDivider.divideStringEquallyOnN(word, n));
    }
}
