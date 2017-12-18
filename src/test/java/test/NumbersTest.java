package test;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NumbersTest {
    private int[] arr2;
    private int[] arr9;

    @Test
    public void testGetDividendsAndDevisors() throws Exception {
        Map<Integer, Set<Integer>> result = Numbers.getDividendsAndDivisors(arr9);

        System.out.println(result.size());

        assertNotNull(result);
    }

    @Test
    public void testSwap() throws Exception {
        Numbers.swap(arr2, 0, 1);

        assertEquals(2, arr2[0]);
    }

    @Before
    public void setUp() throws Exception {
        arr2 = new int[]{1, 2};
        arr9 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}