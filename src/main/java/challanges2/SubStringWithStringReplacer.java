package challanges2;

public class SubStringWithStringReplacer {
    public static void main (String[] args){
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String strToReplace = "dog";
        String strToPut = "frog";
        System.out.println(replaceSubStringWithString(sentence, strToReplace, strToPut));
        System.out.println(startsWithSubString(sentence, strToReplace));

    }

    public static String replaceSubStringWithString(String sentence,String strToReplace, String strToPut){
        if(sentence.contains(strToReplace)){
           return sentence.replace(strToReplace, strToPut);
        }
        return sentence;
    }

    public static boolean startsWithSubString(String sentence,String strToReplace ){
        if(sentence.startsWith(strToReplace)){
            return true;
        }
        return false;
    }
}
