package challenges;

public class StringRecursiveReverser {
     public static String reverse(String word) {
         if(word.length() <= 1){
             return word;
         }
         char letter = word.charAt(0);
         word = word.substring(1);
         return reverse(word) + letter;
     }
}
