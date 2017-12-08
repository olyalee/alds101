package Test;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibTest {

    @Test
    public void testCheckIfFibonacci() throws Exception {
        String fibonacciStart = "011235813";
        String fibonacciPart = "13213455";
        String notFibonacci = "932453";

        boolean isFibonacciStart = Fib.checkIfFibonacci(fibonacciStart);
        boolean isFibonacciPart = Fib.checkIfFibonacci(fibonacciPart);
        boolean isNotFibonacci = Fib.checkIfFibonacci(notFibonacci);

        assertTrue(isFibonacciStart);
        assertTrue(isFibonacciPart);
        assertFalse(isNotFibonacci);
    }
}