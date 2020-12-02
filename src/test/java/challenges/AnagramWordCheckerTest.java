package challenges;

import org.junit.Assert;
import org.junit.Test;

public class AnagramWordCheckerTest{

    @Test
    public void inputEmptyWords(){
        String word1 = "";
        String word2 = "";
        Assert.assertFalse(AnagramWordsChecker.isAnagramWords(word1, word2));
    }

    @Test
    public void inputAnagramWords(){
        String word1 = "silent";
        String word2 = "listen";
        Assert.assertTrue(AnagramWordsChecker.isAnagramWords(word1, word2));
    }

    @Test
    public void inputNotAnagramWords(){
        String word1 = "best";
        String word2 = "test";
        Assert.assertFalse(AnagramWordsChecker.isAnagramWords(word1, word2));
    }
}
