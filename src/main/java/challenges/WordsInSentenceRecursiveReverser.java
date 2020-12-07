package challenges;

public class WordsInSentenceRecursiveReverser {
    public static String reverseSentence(String sentence){
        if(!sentence.contains(" ")){
            return sentence;
        }

        int indexOfSpace = sentence.indexOf(" ");
        String word = sentence.substring(0, indexOfSpace);
        sentence = sentence.substring(indexOfSpace + 1);
        return reverseSentence(sentence) + " " + word;
    }
}
