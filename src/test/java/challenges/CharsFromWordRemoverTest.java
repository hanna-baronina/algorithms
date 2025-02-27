package challenges;

import org.junit.Assert;
import org.junit.Test;



public class CharsFromWordRemoverTest {
    @Test
    public void input(){
        char[] characters = {'a','b','d', 'a'};
        char charToRemove = 'b';
        char secondCharToRemove = 'd';
        char thirdCharToRemove = 'c';
        char[] expectedResult = {'a','d', 'a', ' '};
        Assert.assertArrayEquals(expectedResult, CharsFromWordRemover.removeCharacter(characters, charToRemove, secondCharToRemove, thirdCharToRemove));
    }

    @Test
    public void input1(){
        char[] characters = {'a','b','d','c','a'};
        char charToRemove = 'b';
        char secondCharToRemove = 'd';
        char thirdCharToRemove = 'c';
        char[] expectedResult = {'a','a',' ',' ',' '};
        Assert.assertArrayEquals(expectedResult, CharsFromWordRemover.removeCharacter(characters, charToRemove, secondCharToRemove, thirdCharToRemove));
    }
    @Test
    public void input2(){
        char[] characters = {'a','d','c','a'};
        char charToRemove = 'b';
        char secondCharToRemove = 'd';
        char thirdCharToRemove = 'c';
        char[] expectedResult = {'a','a',' ',' '};
        Assert.assertArrayEquals(expectedResult, CharsFromWordRemover.removeCharacter(characters, charToRemove, secondCharToRemove, thirdCharToRemove));
    }

    @Test
    public void input3(){
        char[] characters = {'a','a','d','c'};
        char charToRemove = 'b';
        char secondCharToRemove = 'd';
        char thirdCharToRemove = 'c';
        char[] expectedResult = {'a','a',' ',' '};
        Assert.assertArrayEquals(expectedResult, CharsFromWordRemover.removeCharacter(characters, charToRemove, secondCharToRemove, thirdCharToRemove));
    }
}
