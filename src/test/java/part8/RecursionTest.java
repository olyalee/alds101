package part8;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void getFactorial() throws Exception {
        int resultFor3 = Recursion.getFactorial(3);
        assertEquals(6, resultFor3);
    }

    @Test
    public void testGetFibonacci() throws Exception {
        int fibonacci = Recursion.getFibonacci(6);
        assertEquals(8, fibonacci);
    }

    @Test
    public void testGetFibonacciMemo() throws Exception {
        int i = 6;
        int [] memo = new int[i+1];

        int fibonacciMemo = Recursion.getFibonacciMemo(i, memo);
        assertEquals(8, fibonacciMemo);
    }
}