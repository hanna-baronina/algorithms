package challenges;

import org.junit.Assert;
import org.junit.Test;


public class SequenceInSentenceCheckerTest {
    @Test
    public void inputExistingWordTwoStartLetters(){
        String word = "exercises";
        String sentence = "Hello Exercises";
        Assert.assertTrue(SequenceInSentenceChecker2.checkPresenceOfSequenceInSentence(sentence,word));
    }

    @Test
    public void inputUnexistingWordTwoStartLetters(){
        String word = "pava";
        String sentence = "Python Exercises";
        Assert.assertFalse(SequenceInSentenceChecker2.checkPresenceOfSequenceInSentence(sentence,word));
    }

    @Test
    public void inputExistingWord(){
        String word = "exercises";
        String sentence = "Pyton Exercises";
        Assert.assertTrue(SequenceInSentenceChecker2.checkPresenceOfSequenceInSentence(sentence,word));
    }

    @Test
    public void inputUnexistingWord(){
        String word = "java";
        String sentence = "Pyton Exercises";
        Assert.assertFalse(SequenceInSentenceChecker2.checkPresenceOfSequenceInSentence(sentence,word));
    }

    @Test
    public void inputArrayOut(){
        String word = "java";
        String sentence = "Pyton Exercises jav";
        Assert.assertFalse(SequenceInSentenceChecker2.checkPresenceOfSequenceInSentence(sentence,word));
    }

}
