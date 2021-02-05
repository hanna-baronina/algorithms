package challanges2;

public class StringContainsSubStringChecker2 {
    public static void main (String[] args){
        String str = "Java and Pyton";
        String subStr = "test";
        System.out.println(checkStringContainsSubString(str, subStr));
    }

    public static boolean checkStringContainsSubString(String str, String subStr){
        char[] strChars = str.toCharArray();
        char[] subStrChars = subStr.toCharArray();

        for(int i = 0; i < strChars.length -2; i++){
            boolean hasAllLetters = true;
            for(int j = 0; j < subStrChars.length; j++){
                if(subStrChars[j] != strChars[j + i]){
                    hasAllLetters = false;
                    break;
                }
            }
            if(hasAllLetters){
                return true;
            }
        }
        return false;
    }
}
