package challenges;

public class CharacterCharacteristicsPrinter {
    public static void main (String[] args){
        char character = 'o';
        getCharInfo(character);
    }

    public static void getCharInfo(char character){
        int position = character - 'a';
        if(position < 0 || position > 26){
            System.out.println("error");
        } else if(character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i'){
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
