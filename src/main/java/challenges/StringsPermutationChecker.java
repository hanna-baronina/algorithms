package challenges;

public class StringsPermutationChecker {
    public static void main(String[] args) {
        String word1 = "xxyz";
        String word2 = "yxzz";
        System.out.println(checkPermutation(word1, word2));
    }

    public static boolean checkPermutation(String word1, String word2) {
        int[] lettersCount = new int[26];
        for (char character : word1.toCharArray()) {
            int position = character - 'a';
            lettersCount[position]++;
        }
        for (char character : word2.toCharArray()) {
            int position = character - 'a';
            lettersCount[position]--;
        }

        for (int count : lettersCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
