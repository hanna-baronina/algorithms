package challenges;

public class BiggestNumberFinder {
    public static void main (String[] args){
        int a = 45;
        int b = 3;
        int c = 17;
        System.out.println(getBiggestNumber2(a,b,c));

    }

    public static int getBiggestNumber(int a, int b, int c){
        if (a > b){
            if (a > c){
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c){
                return b;
            } else {
                return c;
            }
        }

    }

    public static int getBiggestNumber2(int a, int b, int c){
       if(a > b && a > c){
           return a;
       } else if(b > a && b > c){
           return b;
       }
       return c;
    }
}
