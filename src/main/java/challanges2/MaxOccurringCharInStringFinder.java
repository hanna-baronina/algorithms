package challanges2;

public class MaxOccurringCharInStringFinder {
    public static void main (String[] args){
        String str = "test string";
        System.out.println(getMaxOccurringChar(str));
    }

    public static char getMaxOccurringChar(String str){
        char[] characters = str.toCharArray();
        int[] array = new int[26];
        int maxCount = 1;

        for(int character : characters){
            if(character != ' '){
                int position = character - 'a';
                array[position]++;
            }
        }
        int letter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxCount){
                maxCount = array[i];
                letter = i;
            }
        }
        if(maxCount == 1){
            return ' ';
        }
        return (char)('a' + letter);
    }
}
