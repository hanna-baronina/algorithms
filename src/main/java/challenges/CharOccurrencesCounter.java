package challenges;

public class CharOccurrencesCounter {
    public static void main (String[] args){
        String word = "aabca apple";
        char givenChar = 'a';
        System.out.println(getCharOccurrences(word, givenChar));
        printAllCharOccurrences(word);
    }

    public static int getCharOccurrences(String word, char givenChar){
        int count = 0;
        for(char charter : word.toCharArray()){
            if(charter == givenChar){
                count++;
            }
        }
        return count;
    }

    public static void printAllCharOccurrences(String word){
        int count = 0;
        int[] countCharacter = new int[26];
        for(char character : word.toCharArray()){
            int position = character - 'a';
            if(position >= 0 && position < 26){
                countCharacter[position]++;
            }

        }
        for(int i = 0; i < countCharacter.length; i++){
            if(countCharacter[i] != 0){
                char letter = (char) ('a' + i);
                System.out.println(letter + ":" + countCharacter[i]);
            }
        }
    }
}
