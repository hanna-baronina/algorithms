package challanges2;

public class VowelsCalculator {
    public static void main (String[] args){
        String word = "apple aa";
        System.out.println(calculateVowels(word));
    }

    public static int calculateVowels(String word){
       char[] letters = word.toCharArray();
       int countVowels = 0;
       for(char letter : letters){
           if(letter == 'a' || letter == 'o' || letter == 'e' || letter == 'u'|| letter == 'i'){
               countVowels++;
           }
       }
       return countVowels;
    }
}
