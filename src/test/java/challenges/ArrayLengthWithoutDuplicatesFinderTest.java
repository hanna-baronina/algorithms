package challenges;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLengthWithoutDuplicatesFinderTest {
    @Test
    public void inputWithDuplicates() {
        int[] array = {20, 20, 30, 40, 50, 50, 50};
        Assert.assertEquals(4, ArrayLengthWithoutDuplicatesFinder.getUniqueElementsArrayLength(array));
    }

    @Test
    public void inputWithOutDuplicates() {
        int[] array = {20, 30, 40, 50};
        Assert.assertEquals(4, ArrayLengthWithoutDuplicatesFinder.getUniqueElementsArrayLength(array));
    }
}
