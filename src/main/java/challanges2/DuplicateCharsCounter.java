package challanges2;

public class DuplicateCharsCounter {
    public static void main (String [] args){
        String str = "acbbbbcdd";
        System.out.println(countDuplicateChars(str));
    }

    public static int countDuplicateChars(String str){
        str = str.toLowerCase();
        char[] characters = str.toCharArray();
        int[] result = new int[26];

        for(char letter : characters){
            int position = letter - 'a';
            result[position]++;
        }
        int countDuplicates = 0;
        for(int count : result){
            if(count > 1){
                countDuplicates++;
            }
        }
        return countDuplicates;
    }
}
