import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class FibonacciTest {
    @Test
    public void testCalculate() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals(expected, Fibonacci.calculate(10));
    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCalculateWithNegativeN() {
//        Fibonacci.calculate(-1);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCalculateWithZeroN() {
//        Fibonacci.calculate(0);
//    }
}