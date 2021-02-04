package challanges2;

public class LongestPalindromicSubStringFinder {
    public static void main (String[] args){
        String str = "thequickbrownfoxxofnworbquickthe";
        System.out.println(getLongestPalindromic(str));
    }

    public static String getLongestPalindromic(String str){
        for(int windowSize = str.length(); windowSize > 1; windowSize--){
            for(int j = 0; j < str.length() - windowSize; j++){
                String subStr = str.substring(j, j + windowSize);
                System.out.println(subStr);
                if(isPalindromic(subStr)){
                    return subStr;
                }
            }
        }
        return "";
    }

    public static boolean isPalindromic(String str){
        char[] strCharacters = str.toCharArray();
        int startIndex = 0;
        int endIndex = str.length() -1;

        while(startIndex < endIndex){
            if (strCharacters[startIndex] != strCharacters[endIndex]) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }
}
