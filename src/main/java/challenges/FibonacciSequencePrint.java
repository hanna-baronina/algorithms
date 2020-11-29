package challenges;

public class FibonacciSequencePrint {

    static void printFibonacciSequence(int n){
        if(n >= 0){
            System.out.println(0);
        }
        if(n >= 1){
            System.out.println(1);
        }
        if(n > 1){
            int prevPrev = 0;
            int prev= 1;
            int current = 0;

            for(int i = 2; i <= n; i ++){
                current = prevPrev + prev;
                prevPrev = prev;
                prev = current;
                System.out.println(current);
            }
        }
    }
}
