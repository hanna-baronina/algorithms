package challanges2;

public class StringsLexicologicalComparator {
    public static void main (String [] args){
        String str1 = "town";
        String str2 = "tows";
        System.out.println(checkStringsEqual(str1, str2));
    }
    public static boolean checkStringsEqual(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
