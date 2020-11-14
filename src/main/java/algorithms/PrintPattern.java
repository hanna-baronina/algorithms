package algorithms;

public class PrintPattern {
    public static void main (String[] args){
        for(int i = 0; i < 6; i++){
            System.out.println();
            for(int j  = 1; j < i +1; j++){
                System.out.print(j);
            }
        }
    }
}
