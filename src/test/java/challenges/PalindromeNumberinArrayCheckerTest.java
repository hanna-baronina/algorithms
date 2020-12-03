package challenges;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberinArrayCheckerTest {
    @Test
    public void inputNumberOneDigitLength(){
        Assert.assertTrue(PalindromeNumberinArrayChecker.isPailndromeNumber(0));
    }

    @Test
    public void inputPalindromeLength(){
        Assert.assertTrue(PalindromeNumberinArrayChecker.isPailndromeNumber(121));
    }

    @Test
    public void inputNotPalindromeLength(){
        Assert.assertFalse(PalindromeNumberinArrayChecker.isPailndromeNumber(122));
    }

    @Test
    public void inputOddPalindromeLength(){
        Assert.assertTrue(PalindromeNumberinArrayChecker.isPailndromeNumber(1221));
    }
}
