package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountAmountOfLetters {
    public static void main(String[] args) {
        String word = " apple apple";
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            if (key == ' ') {
                continue;
            }
            if (letters.containsKey(key)) {
                letters.put(key, letters.get(key) + 1);
            } else {
                letters.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + " " + letter.getValue());

        }
    }
}
