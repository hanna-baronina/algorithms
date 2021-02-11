package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class SmallestSubstringContainingAllLettersFinderTest {
    @Test
    public void input(){
        String str = "welcome to w3resource";
        String str2 = "tower";
        String result = "to w3re";
        Assert.assertEquals(result, SmallestSubstringContainingAllLettersFinder.findSmallestContainingLetters(str, str2));
    }

    @Test
    public void input1(){
        String str = "welcome to w3resource";
        String str2 = "abd";
        String result = "not found";
        Assert.assertEquals(result, SmallestSubstringContainingAllLettersFinder.findSmallestContainingLetters(str, str2));
    }

    @Test
    public void input2(){
        String str = "welcomer to w3resource";
        String str2 = "tower";
        String result = "er to w";
        Assert.assertEquals(result, SmallestSubstringContainingAllLettersFinder.findSmallestContainingLetters(str, str2));
    }
}
