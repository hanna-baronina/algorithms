package challenges;

public class FirstNonRepeatingCharFinder {
    public static void main (String[] args){
        String input = "aaaabbz";
        System.out.println(getFirstNonRepeating(input));
    }

    public static char getFirstNonRepeating(String input){
        char[] character = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            boolean hasDuplicate = false;
            for(int j = 0 ; j < input.length(); j++){
                if(character[i] == character[j] && i != j){
                    hasDuplicate = true;
                }
            }
            if(!hasDuplicate){
                return character[i];
            }
        }
        return ' ';
    }
}
