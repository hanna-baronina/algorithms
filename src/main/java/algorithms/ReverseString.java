package algorithms;

public class ReverseString {
    public static void main (String[] args){
        String string = "apple";
        StringBuilder str = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i --){
            str = str.append(string.charAt(i));
        }
        System.out.println(str);

    }
}
