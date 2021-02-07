package challanges2;

public class StringInPartsDivider {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        int n = 2;
        printDividedSubStrings(str, n);
    }

    public static void printDividedSubStrings(String str, int n) {
        for (int i = 0; i < str.length(); i += n) {
            System.out.println("---------");
            for (int j = i; j < i + n; j++) {
                if (j < str.length()) {
                    System.out.print(str.charAt(j));
                } else {
                    break;
                }
            }
        }
    }
}
