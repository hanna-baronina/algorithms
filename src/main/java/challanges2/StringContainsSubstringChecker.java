package challanges2;

public class StringContainsSubstringChecker {
    public static void main (String[] args){
        String str = "Exercises and Python";
        String subStr = "and";
        System.out.println(checkStringContainsSubstring(str, subStr));

    }

    public static boolean checkStringContainsSubstring(String str, String subStr) {
        char[] strArray = str.toCharArray();
        char[] subStrArray = subStr.toCharArray();

        for (int i = 0; i <= strArray.length - subStrArray.length; i++) {
            boolean hasAllLetters = true;
            for (int j = 0; j < subStrArray.length; j++) {
                if (strArray[i + j] != subStrArray[j]) {
                    hasAllLetters = false;
                    break;
                }
            }
            if (hasAllLetters) {
                return hasAllLetters;
            }
        }
        return false;
    }
}
