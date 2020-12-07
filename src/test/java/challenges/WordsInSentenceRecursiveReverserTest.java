package challenges;

import org.junit.Assert;
import org.junit.Test;

public class WordsInSentenceRecursiveReverserTest {

    @Test
    public void inputString(){
        String sentence = "the quick brown fox";
        Assert.assertEquals("fox brown quick the", WordsInSentenceRecursiveReverser.reverseSentence(sentence));
    }

    @Test
    public void inputEmptyString(){
        String sentence = "";
        Assert.assertEquals("", WordsInSentenceRecursiveReverser.reverseSentence(sentence));
    }
}
