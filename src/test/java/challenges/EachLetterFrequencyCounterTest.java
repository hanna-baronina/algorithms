package challenges;

        import org.junit.Assert;
        import org.junit.Test;

        import java.util.HashMap;
        import java.util.Map;

public class EachLetterFrequencyCounterTest {
    @Test
    public void inputString() {
        String sentence = "Hello aworldz!";
        Map<Character, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put('r', 1);
        expectedHashMap.put('d', 1);
        expectedHashMap.put('e', 1);
        expectedHashMap.put('w', 1);
        expectedHashMap.put('h', 1);
        expectedHashMap.put('l', 3);
        expectedHashMap.put('o', 2);
        expectedHashMap.put('a', 1);
        expectedHashMap.put('z', 1);
        Assert.assertEquals(expectedHashMap, EachLetterFrequencyCounter.countFrequencyOfEachLetter(sentence));
    }

    @Test
    public void inputEmptyString() {
        String sentence = "";
        Map<Character, Integer> expectedHasMap = new HashMap<>();
        Assert.assertEquals(expectedHasMap, EachLetterFrequencyCounter.countFrequencyOfEachLetter(sentence));
    }
}
