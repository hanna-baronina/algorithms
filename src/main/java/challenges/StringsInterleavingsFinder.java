package challenges;

public class StringsInterleavingsFinder {
    public static void main(String[] args){
        String word1 = "WX";
        String word2 = "YZ";
        printAllInterleavings(word1, word2);
    }

    public static void printAllInterleavings(String word1, String word2 ){
        String combinedWord = word1 + word2;
        char[] letters = combinedWord.toCharArray();
        for(int i = 0 ; i < letters.length - 4; i++){
            for(int j = i + 1; j < letters.length - 3; j++){
                for(int k = j  + 1; k <letters.length -2; k++){
                    for(int m = k + 1; m< letters.length; m++){
                        if(m == k || m == j || m == i || k == j || k == i || j == i){
                            continue;
                        } else {
                            System.out.println(letters[i] +""+ letters[j] +""+ letters[k] +""+ letters[m]);
                        }
                    }
                }
            }
        }
    }
}