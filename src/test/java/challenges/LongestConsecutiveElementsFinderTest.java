package challenges;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveElementsFinderTest {

    @Test
    public void inputWithConsecutive() {
        int[] array = {7, 1, 3, 8, 2, 4, 9, 5, 10, 11, 12, 13, 14};
        Assert.assertEquals(8, LongestConsecutiveElementsFinder.getMaxLength(array));
    }

    @Test
    public void inputWithoutConsecutive() {
        int[] array = {1, 3, 5, 7, 9};
        Assert.assertEquals(1, LongestConsecutiveElementsFinder.getMaxLength(array));
    }
}
