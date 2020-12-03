package challenges;

import org.junit.Assert;
import org.junit.Test;

public class PangramSentenceCheckerTest {

    @Test
    public void inputEmptySentence(){
        String sentence = "";
        Assert.assertFalse(PangramSentenceChecker.isPangramSentence(sentence));
    }

    @Test
    public void inputPangramSentence(){
        String sentence = "The quick brown fox jumps over the lazy dog";
        Assert.assertTrue(PangramSentenceChecker.isPangramSentence(sentence));
    }

    @Test
    public void inputNotPangramSentence(){
        String sentence = "The quick brown fox jumps over the lazy cat";
        Assert.assertFalse(PangramSentenceChecker.isPangramSentence(sentence));
    }
}
