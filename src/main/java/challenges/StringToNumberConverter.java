package challenges;

public class StringToNumberConverter {

    public static int convertStringToNumber(String number){
        char[] characters = number.toCharArray();
        int numberInteger = 0;

        for(char character : characters){
            int digit = convertCharToIntHackyWay(character);
            numberInteger = numberInteger * 10 + digit;
        }
        return numberInteger;
    }
    private static int convertCharToIntHackyWay(char character) {
        return character - '0';
    }
}
