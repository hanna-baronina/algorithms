package challenges;

import org.junit.Assert;
import org.junit.Test;

public class DistinctWordsFromSentenceTest {

    @Test
    public void inputEmpty(){
        Assert.assertEquals("[]",
                DistinctWordsFromSentence.getDistinctWords(""));
    }

    @Test
    public void inputAllDistinct(){
        Assert.assertEquals("[apple, cat, dog]",
                DistinctWordsFromSentence.getDistinctWords("apple cat dog"));
    }

    @Test
    public void inputOneDistinct(){
        Assert.assertEquals("[cat]",
                DistinctWordsFromSentence.getDistinctWords("cat cat cat"));
    }

    @Test
    public void inputTwoDistinct(){
        Assert.assertEquals("[the, and, cat, dog]",
                DistinctWordsFromSentence.getDistinctWords("The cat and the  dog"));
    }
}
