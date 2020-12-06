package challenges;

import org.junit.Assert;
import org.junit.Test;

public class SentenceCutterTest {

    @Test
    public void inputNLongerThanStringLength(){
        String sentence = "abcd";
        Assert.assertEquals("abcd",SentenceCutter.cutSentenceOnNSymbol(sentence, 6));
    }

    @Test
    public void inputNToBeOnSpace(){
        String sentence = "abcd d";
        Assert.assertEquals("abcd",SentenceCutter.cutSentenceOnNSymbol(sentence, 5));
    }

    @Test
    public void inputNAfterSpace(){
        String sentence = "abcd da";
        Assert.assertEquals("abcd",SentenceCutter.cutSentenceOnNSymbol(sentence, 6));
    }

    @Test
    public void inputStringWithoutSpace(){
        String sentence = "abcdda";
        Assert.assertEquals("",SentenceCutter.cutSentenceOnNSymbol(sentence, 4));
    }

    @Test
    public void inputNNull(){
        String sentence = "abcd";
        Assert.assertEquals("",SentenceCutter.cutSentenceOnNSymbol(sentence, 0));
    }
}
