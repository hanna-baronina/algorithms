package challenges;

import java.util.Arrays;

public class StringInEqualPartsDivider {
    public static String[] divideStringEquallyOnN(String word, int n) {
        int charactersPerSubString = (int) Math.ceil((double) word.length() / n);
        String[] arrayResult = new String[n];
        int count = 0;

        for (int i = 0; i < word.length(); i += charactersPerSubString) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = i; j < i + charactersPerSubString && j < word.length(); j++) {
                stringBuilder.append(word.charAt(j));
            }
            arrayResult[count] = stringBuilder.toString();
            count++;
        }
        return arrayResult;
    }
}

