package challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDigitsPrinter2Test {

    @Test
    public void inputWithoutDuplicates(){
        int[] array = {0,2,3,5,6};
        Set<Integer> expected = new HashSet<>();
        Assert.assertEquals(expected,DuplicateDigitsPrinter2.findDuplicateValues(array));
    }

    @Test
    public void inputWithDuplicates(){
        int[] array = {1,2,2,5,5};
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(5);
        Assert.assertEquals(expected,DuplicateDigitsPrinter2.findDuplicateValues(array));
    }

    @Test
    public void inputWithTreeDuplicates(){
        int[] array = {1,2,2,5,5,5};
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(5);
        Assert.assertEquals(expected,DuplicateDigitsPrinter2.findDuplicateValues(array));
    }
}