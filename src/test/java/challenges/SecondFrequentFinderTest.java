package challenges;

import org.junit.Assert;
import org.junit.Test;

public class SecondFrequentFinderTest {
    @Test
    public void input(){
        String word = "success";
        Assert.assertEquals('c',SecondFrequentFinder.getSecondFrequentCharacter(word));

    }
//    @Test
//    public void input1(){
//        String word = "stest";
//        Assert.assertEquals('s',SecondFrequentFinder.getSecondFrequentCharacter(word));
//    }
}
