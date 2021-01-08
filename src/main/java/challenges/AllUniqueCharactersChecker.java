package challenges;

public class AllUniqueCharactersChecker {
    public static void main (String[] args){
        String word = "xyyz!";
        System.out.println(checkIfAllUniqueChars(word));
    }

    public static boolean checkIfAllUniqueChars(String  word){
        int[] lettersCount = new int[26];
        for(char character : word.toCharArray()){
           int position = character - 'a';
           if(position >= 0 && position < 26){
               lettersCount[position]++;
           }
        }

        for(int count : lettersCount){
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
