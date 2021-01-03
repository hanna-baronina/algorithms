package challenges;

public class FibonacciRecursiveFinder {
    public static int getFibonacciNumber(int position) {
        if (position == 0 || position == 1) {
            return position;
        }
        return getFibonacciNumber(position - 1) + getFibonacciNumber(position - 2);
    }
}
