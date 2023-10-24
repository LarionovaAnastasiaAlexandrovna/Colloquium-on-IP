import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> calculate(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int first = 0;
        int second = 1;
        fibonacciNumbers.add(first);
        if (n > 1) {
            fibonacciNumbers.add(second);
            for (int i = 2; i < n; i++) {
                int next = first + second;
                fibonacciNumbers.add(next);
                first = second;
                second = next;
            }
        }
        return fibonacciNumbers;
    }
}
