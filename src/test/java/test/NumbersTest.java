package test;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
    private int[] arr2;
    private int[] arr3;
    private int[] arr8;
    private int[] arr9;

    @Test
    public void testGetPairs() throws Exception {
        HashMap<Integer, Integer> delimeter3 = Numbers.getDelimeterWithNumbers(arr3);
        HashMap<Integer, Integer> delimeter8 = Numbers.getDelimeterWithNumbers(arr8);
        //it takes too long
//        HashMap<Integer, Integer> delimeter9 = Numbers.getDelimeterWithNumbers(arr9);

        assertEquals(2270, delimeter8.size());
        assertEquals(0, delimeter8.get(15368427) % 15368427);
    }

    @Test
    public void testSwap() throws Exception {
        Numbers.swap(arr2, 0, 1);

        assertEquals(2, arr2[0]);
    }

    @Before
    public void setUp() throws Exception {
        arr2 = new int[]{1, 2};
        arr3 = new int[]{1, 2, 3};
        arr8 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        arr9 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}