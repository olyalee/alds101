package test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FinalTest {

    private List<String> list;

    @Test
    public void getSubstring() throws Exception {
        String substring = Final.getLongestSubstring("CUUCGCAGGA", "CUUCCCAGGA");

        assertEquals("CAGGA", substring);
    }

    @Test
    public void getSubset() throws Exception {
        String subset = Final.getSubset("CUUCGCAGGA", "CUUCCCAGGA");

        assertEquals("CUUCCAGGA", subset);
    }

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        list.add("CUUCGCAGGA");
        list.add("CUUCCCAGGA");
        list.add("CUUCACGACC");
    }


}