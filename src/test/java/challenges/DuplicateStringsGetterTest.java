package challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringsGetterTest {
    @Test
    public void inputDuplicateStrings() {
        String[] array = {"apple", "table", "orange", "apple", "apple"};
        Set<String> expected = new HashSet<>();
        expected.add("apple");

        Assert.assertEquals(expected, DuplicateStringsGetter.getDuplicateStrings(array));
    }

    @Test
    public void inputTwoDuplicateStrings() {
        String[] array = {"table", "orange", "apple", "apple"};
        Set<String> expected = new HashSet<>();
        expected.add("apple");

        Assert.assertEquals(expected, DuplicateStringsGetter.getDuplicateStrings(array));
    }

    @Test
    public void inputStrings() {
        String[] array = {"table", "orange", "apple"};
        Set<String> expected = new HashSet<>();

        Assert.assertEquals(expected, DuplicateStringsGetter.getDuplicateStrings(array));
    }
}
