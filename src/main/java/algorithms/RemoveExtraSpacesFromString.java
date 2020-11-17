package algorithms;


public class RemoveExtraSpacesFromString {
    public static void main(String[] args){
        String sentence = "Try    to    remove   extra   spaces.";
        String[] words = sentence.split(" ");

        StringBuilder strb = new StringBuilder();

        for(String word : words){
            if(!word.equals("")){
                strb.append(word);
                strb.append(" ");
            }
        }
        strb.deleteCharAt(strb.length()-1);
        System.out.println(strb);


    }
}
