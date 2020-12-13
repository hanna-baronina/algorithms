package challenges;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CommonStringsInArraysFinderTest {

    @Test
    public void inputWithoutCommonStrings() {
        String[] array1 = {"apple", "table", "test"};
        String[] array2 = {"pineapple", "desk"};
        Set<String> expected = new HashSet<>();
        Assert.assertEquals(expected, CommonStringsInArraysFinder.findCommonStringInArrays(array1, array2));
    }

    @Test
    public void inputWithCommonStrings() {
        String[] array1 = {"apple", "table", "test"};
        String[] array2 = {"apple", "desk"};
        Set<String> expected = new HashSet<>();
        expected.add("apple");
        Assert.assertEquals(expected, CommonStringsInArraysFinder.findCommonStringInArrays(array1, array2));
    }

}
