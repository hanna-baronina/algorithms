package challenges;

import java.util.Arrays;

public class CharsFromWordRemover {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'd', 'a'};
        char charToRemove = 'b';
        char secondCharToRemove = 'd';
        char thirdCharToRemove = 'c';
        System.out.println(Arrays.toString(removeCharacter(characters, charToRemove, secondCharToRemove, thirdCharToRemove)));
    }

    public static char[] removeCharacter(char[] characters, char firstCharToRemove, char secondCharToRemove, char thirdCharToRemove) {
        int writeIndex = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == firstCharToRemove) {
                continue;
            } else if (characters[i] == secondCharToRemove && characters[i + 1] == thirdCharToRemove) {
                i++;
            } else {
                characters[writeIndex] = characters[i];
                writeIndex++;
            }
        }

        for (int j = writeIndex; j < characters.length; j++) {
            characters[j] = Character.MIN_VALUE;
        }
        return characters;
    }
}
