package challenges;

public class FibonacciSequence {

     static String getFibonacciSequence(int n){
        StringBuilder stringBuilder = new StringBuilder();
        if(n >= 0){
            stringBuilder.append(0);
        }
        if(n >= 1){
            stringBuilder.append(1);
        }
        if(n > 1){
            int prevPrev = 0;
            int prev = 1;

            for(int i = 2; i <= n; i++){
                int current = prevPrev + prev;
                prevPrev = prev;
                prev = current;
                stringBuilder.append(current);
            }
        }
        return stringBuilder.toString();
    }
}
