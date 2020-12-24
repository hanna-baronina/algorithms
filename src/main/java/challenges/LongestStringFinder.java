package challenges;

public class LongestStringFinder {
    public static void main(String[] args) {
        String[] array = {"abc", "ab","b"};
        System.out.println(getLongestString(array));
    }

    public static String getLongestString(String[] array){
        int maxLength = 0;
        String maxLengthWord = "";
        for(String word : array){
            if(word.length() > maxLength){
                maxLength = word.length();
                maxLengthWord = word;

            }
        }
        return maxLengthWord;
    }
}
