package challenges;

public class SentenceCutter {
    public static String cutSentenceOnNSymbol(String sentence, int N){
        if(N >= sentence.length()){
            return sentence;
        } else {
            for (int i = N; i > 0; i--){
                if(sentence.charAt(i) == ' '){
                    return sentence.substring(0, i);
                }
            }
            return "";
        }
    }
}
