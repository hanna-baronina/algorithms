package challenges;


import org.junit.Assert;
import org.junit.Test;

public class DuplicateCharactersCounterTest {
    @Test
    public void input(){
        String input = "aaa aa b";
        Assert.assertEquals(1,DuplicateCharactersCounter.countDuplicateChar(input));
    }

    @Test
    public void input2(){
        String input = "aaa aa bb";
        Assert.assertEquals(2,DuplicateCharactersCounter.countDuplicateChar(input));
    }

    @Test
    public void input3(){
        String input = "aba aa bcc";
        Assert.assertEquals(3,DuplicateCharactersCounter.countDuplicateChar(input));
    }

}
