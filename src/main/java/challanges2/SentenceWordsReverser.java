package challanges2;

public class SentenceWordsReverser {
    public static void main (String[] args){
        String sentence = " Reverse words in a given string ";
        System.out.println(reverseWordsInSentence(sentence));
    }

    public static String reverseWordsInSentence(String sentence){
        sentence = sentence.trim();
        System.out.println(sentence);
        String [] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i-- ){
            if(i == 0) {
                sb.append(words[i]);
            } else {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
