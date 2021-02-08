package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class AnagramWordsCheckerTest {
    @Test
    public void input(){
        String str1 = "world";
        String str2 = "droln";
        Assert.assertFalse(AnagramWordsChecker.isAnagramWords(str1,str2));
    }
    @Test
    public void input1(){
        String str1 = "world";
        String str2 = "drolw";
        Assert.assertTrue(AnagramWordsChecker.isAnagramWords(str1, str2));
    }

    @Test
    public void input2(){
        String str1 = "world";
        String str2 = "drol";
        Assert.assertFalse(AnagramWordsChecker.isAnagramWords(str1, str2));
    }

    @Test
    public void input3(){
        String str1 = "worl";
        String str2 = "drold";
        Assert.assertFalse(AnagramWordsChecker.isAnagramWords(str1, str2));
    }

}

