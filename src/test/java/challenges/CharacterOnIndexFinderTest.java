package challenges;

import org.junit.Assert;
import org.junit.Test;

public class CharacterOnIndexFinderTest {
    @Test
    public void inputFirstIndex() {
        String sentence = "Java Exercises!";
        int index = 0;
        Assert.assertEquals('J', CharacterOnIndexFinder.getCharacter(sentence, index));
    }

    @Test
    public void inputLastIndex() {
        String sentence = "Java Exercises!";
        int index = 14;
        Assert.assertEquals('!', CharacterOnIndexFinder.getCharacter(sentence, index));
    }

    @Test
    public void inputOutOfBoundIndex() {
        String sentence = "Java Exercises!";
        int index = 15;
        Assert.assertEquals(' ', CharacterOnIndexFinder.getCharacter(sentence, index));
    }
}
