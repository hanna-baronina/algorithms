package algorithms2;

public class FibonacciIterative {
    static int getFibonacci(int index){
        if(index < 2){
            return index;
        }
        int prevPrev = 0;
        int prev = 1;
        int current = 0;

        for(int i = 2; i <= index; i++){
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
}
