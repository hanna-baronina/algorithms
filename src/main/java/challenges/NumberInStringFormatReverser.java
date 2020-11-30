package challenges;

public class NumberInStringFormatReverser {
    public static String reverseNumber(int number){
       String numberInStringFormat = String.valueOf(number);
       StringBuilder stringBuilder = new StringBuilder(numberInStringFormat);
       return  stringBuilder.reverse().toString();
    }
}
