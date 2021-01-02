package challenges;


import org.junit.Assert;
import org.junit.Test;

public class ItemsContainingCharactersPrinterTest {
    String[] getItemsContainingCharacters(String[] words, String givenWord){
        return ItemsContainingCharactersPrinter.getItemsContainingCharacters(words, givenWord);
    }

    @Test
    public void input(){
        String[] words = {"rabbit" , "yellow", "bribe"};
        String givenWord = "bib";
        String[] expectedResult = {"rabbit", "bribe"};
        Assert.assertArrayEquals(expectedResult, getItemsContainingCharacters(words, givenWord));

    }

    @Test
    public void input1(){
        String[] words = {"rabbit" , "yellow", "bribeb"};
        String givenWord = "bib";
        String[] expectedResult = {"rabbit", "bribeb"};
        Assert.assertArrayEquals(expectedResult, getItemsContainingCharacters(words, givenWord));
    }

    @Test
    public void input2(){
        String[] words = {"rabit" , "yellow", "bribe"};
        String givenWord = "bib";
        String[] expectedResult = {"bribe"};
        Assert.assertArrayEquals(expectedResult, getItemsContainingCharacters(words, givenWord));
    }

    @Test
    public void input3(){
        String[] words = {"yellow" , "yellow", "yellow"};
        String givenWord = "bib";
        String[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, getItemsContainingCharacters(words, givenWord));
    }
}

