package challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CommonLettersFinderTest {
    @Test
    public void input() {
        String word1 = "apple";
        String word2 = "pineapple";
        Character[] expectedResult = {'a', 'p', 'l', 'e'};
        Arrays.sort(expectedResult);
        Character[] actualResult = CommonLettersFinder.getCommonLetters(word1, word2);
        Arrays.sort(actualResult);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void input1() {
        String word1 = "apple";
        String word2 = "moon";
        Character[] expectedResult = {};
        Character[] actualResult = CommonLettersFinder.getCommonLetters(word1, word2);
        Arrays.sort(actualResult);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void input2() {
        String word1 = "apple";
        String word2 = "appple";
        Character[] expectedResult = {'a', 'p', 'l', 'e'};
        Arrays.sort(expectedResult);
        Character[] actualResult = CommonLettersFinder.getCommonLetters(word1, word2);
        Arrays.sort(actualResult);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
