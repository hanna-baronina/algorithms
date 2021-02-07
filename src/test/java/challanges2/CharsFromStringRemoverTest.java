package challanges2;

import org.junit.Assert;
import org.junit.Test;

public class CharsFromStringRemoverTest {
    @Test
    public void input(){
        String str = "the quick brown fox";
        String toRemove = "queen";
        String result = "th ick brow fox";
        Assert.assertEquals(result,CharsFromStringRemover.removeCharsFromString(str, toRemove));
    }

    @Test
    public void input1(){
        String str = "the quick brown fox";
        String toRemove = "the";
        String result = " quick brown fox";
        Assert.assertEquals(result,CharsFromStringRemover.removeCharsFromString(str, toRemove));
    }

    @Test
    public void input2(){
        String str = "the quick brwn fox";
        String toRemove = "fox";
        String result = "the quick brwn ";
        Assert.assertEquals(result,CharsFromStringRemover.removeCharsFromString(str, toRemove));
    }
}
