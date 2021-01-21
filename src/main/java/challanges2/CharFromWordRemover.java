package challanges2;

public class CharFromWordRemover {
    public static void main (String[] args){
        String word = "red apple";
        char char1 = 'a';
        char char2 = 'p';
        char char3 = 'e';
        System.out.println(removeGivenLetters(word, char1, char2, char3));

    }

    public static String removeGivenLetters(String word, char char1, char char2, char char3){
        for(int i = 0; i < word.length(); i++){
           if(word.charAt(i) == char1 && word.charAt(i + 1) == char2){
              word = word.substring(0, i) +  word.substring(i + 1 + 1);
           } else if (word.charAt(i) == char3){
               word = word.substring(0, i) +  word.substring(i + 1);
           }
       }
        return word;
    }
}
