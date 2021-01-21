package challanges2;

public class AnagramStringsChecker {
    public static void main(String[] args){
        String word1 = "listen";
        String word2 = "siment";
        System.out.println(isAnagramWords(word1, word2));
    }

    public static boolean isAnagramWords(String word1, String word2){
        char[] word1Letters = word1.toCharArray();
        int[] lettersCount = new int[26];

        for(char letter : word1Letters){
            int position = letter - 'a';
            lettersCount[position]++;
        }

        char[] word2Letters = word2.toCharArray();
        for(char letter : word2Letters){
            int position = letter - 'a';
            lettersCount[position]--;
        }
        boolean isEmpty = true;
        for(int i = 0; i < lettersCount.length; i++){
            if(lettersCount[i] != 0){
                isEmpty = false;
            }
        }
        return isEmpty;
    }
}
