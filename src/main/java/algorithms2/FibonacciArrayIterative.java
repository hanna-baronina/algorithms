package algorithms2;

public class FibonacciArrayIterative {
    public static void main (String[] args){
        System.out.println(getFibonacciNumber(6));
    }

    static int getFibonacciNumber(int index){
        if(index < 2){
            return index;
        }

        int[] fibArray = new int[index + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for(int i = 2; i <= index; i++){
            fibArray[i] = fibArray[i - 1] + fibArray[i -2];
        }
        return fibArray[index];
    }
}
