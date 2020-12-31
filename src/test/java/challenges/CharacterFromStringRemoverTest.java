package challenges;

import org.junit.Assert;
import org.junit.Test;

public class CharacterFromStringRemoverTest {
    @Test
    public void input() {
        String sentence = "the quickest brown fox";
        String word = "queent";
        Assert.assertEquals("h icks brow fox", CharacterFromStringRemover.removeCharacters(sentence, word));
    }

    @Test
    public void input1() {
        String sentence = "the quick brown fox";
        String word = "adjlp";
        Assert.assertEquals("the quick brown fox", CharacterFromStringRemover.removeCharacters(sentence, word));
    }

    @Test
    public void input2() {
        String sentence = "queen";
        String word = "queen";
        Assert.assertEquals("", CharacterFromStringRemover.removeCharacters(sentence, word));
    }
}
