package challanges2;

public class AnagramStringsChecker {
    public static void main(String[] args){
        String word1 = "listen";
        String word2 = "siment";
        System.out.println(isAnagramWords(word1, word2));
    }

    public static boolean isAnagramWords(String word1, String word2){
        int[] lettersCount = new int[26];

        for (char letter : word1.toCharArray()){
            int position = letter - 'a';
            lettersCount[position]++;
        }

        for (char letter : word2.toCharArray()){
            int position = letter - 'a';
            lettersCount[position]--;
        }
        boolean isEmpty = true;
        for (int value : lettersCount) {
            if (value != 0) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }
}
