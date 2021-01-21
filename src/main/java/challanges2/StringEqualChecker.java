package challanges2;

public class StringEqualChecker {
    public static void main(String[] args){
        String word1 = "hello";
        String word2 = "kello";
        System.out.println(checkIfStringsEqual(word1, word2));
    }

    public static boolean checkIfStringsEqual(String word1, String word2){
         if (word1.length() != word2.length()){
             return false;
         }
         for (int i = 0; i < word1.length(); i++){
             if (word1.charAt(i) != word2.charAt(i)){
                 return false;
             }
         }
         return true;
    }
}
