package challenges;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberCheckerTest {

    @Test
    public void inputNumberOneDigitLength(){
        Assert.assertTrue(PalindromeNumberChecker.isNumberPalindrome(0));
    }

    @Test
    public void inputPalindromeLength(){
        Assert.assertTrue(PalindromeNumberChecker.isNumberPalindrome(121));
    }

    @Test
    public void inputNotPalindromeLength(){
        Assert.assertFalse(PalindromeNumberChecker.isNumberPalindrome(122));
    }

    @Test
    public void inputOddPalindromeLength(){
        Assert.assertTrue(PalindromeNumberChecker.isNumberPalindrome(1221));
    }
}
