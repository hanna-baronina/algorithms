package challanges2;

public class AllPermutationsWithRepetitionPrinter {
    public static void main (String[] args){
        String str = "PQR";
        printAllPermutations(str);

    }

    public static void printAllPermutations(String str){
        char[] characters = str.toCharArray();
        for(int i = 0; i < characters.length; i++){
            for(int j = 0; j < characters.length; j++){
                for(int k = 0; k < characters.length;k++){
                    System.out.println(characters[i] + ","+ characters[j] +","+ characters[k]);
                }
            }
        }
    }
}
