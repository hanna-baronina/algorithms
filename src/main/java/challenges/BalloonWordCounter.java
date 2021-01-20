package challenges;

public class BalloonWordCounter {
    public static void main(String[] args) {
        String word = "balloonbtrebaoon";
        System.out.println(getNumberOfBalloonWords(word));
    }

    public static int getNumberOfBalloonWords(String word){
        char[] wordLetters = word.toCharArray();
        int minValue = Integer.MAX_VALUE;
        int a = 0; int b = 0; int l = 0; int o = 0; int n = 0;

        for(char letter : wordLetters){
            if(letter == 'a'){ a++;}
            if(letter == 'b'){ b++;}
            if(letter == 'l'){ l++;}
            if(letter == 'o'){ o++;}
            if(letter == 'n'){ n++;}
        }

        o = o/2;
        l = l/2;

        if(a < minValue){ minValue = a;}
        if(b < minValue){ minValue = b;}
        if(l < minValue){ minValue = l;}
        if(o < minValue){ minValue = o;}
        if(n < minValue){ minValue = n;}

        return minValue;
    }
}
