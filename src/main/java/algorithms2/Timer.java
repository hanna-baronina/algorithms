package algorithms2;

public class Timer {
    public static void main(String[] args){
        timer(20);
    }

    static void timer(int n){
        System.out.println(n);
        if (n == 0){
            return;
        }
        n = n - 1;
        timer(n);
    }
}
