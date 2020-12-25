package challenges;

import org.junit.Assert;
import org.junit.Test;

public class StringsComparatorTest {
    @Test
    public void inputSmallerString() {
        String sentence1 = "This is Exercise 1";
        String sentence2 = "This is Exercise ";
        Assert.assertFalse(StringComparator.compareStrings(sentence1, sentence2));
    }

    @Test
    public void inputLongerString() {
        String sentence1 = "This is Exercise 1";
        String sentence2 = "This is Exercise 12";
        Assert.assertFalse(StringComparator.compareStrings(sentence1, sentence2));
    }

    @Test
    public void inputEqualLengthStrings() {
        String sentence1 = "This is Exercise 1";
        String sentence2 = "This is Exercise 1";
        Assert.assertTrue(StringComparator.compareStrings(sentence1, sentence2));
    }

    @Test
    public void inputEqualLengthNotEqualStrings() {
        String sentence1 = "This is Exercise 1";
        String sentence2 = "This is Exercise 2";
        Assert.assertFalse(StringComparator.compareStrings(sentence1, sentence2));
    }
}
