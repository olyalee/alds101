package part8;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task84Test {
    private static String[] set2;
    private static String[] set3;
    private static String[] set4;


    @Test
    public void testGetAllSubsets() throws Exception {
        List<HashSet<String>> allSubsets2 = Task84.getSubsets(set2);
        List<HashSet<String>> allSubsets3 = Task84.getSubsets(set3);
        List<HashSet<String>> allSubsets4 = Task84.getSubsets(set4);

        //2^elements
        assertEquals(4, allSubsets2.size());
        assertEquals(8, allSubsets3.size());
        assertEquals(16, allSubsets4.size());
    }

    @Before
    public void setUp() throws Exception {
        set2 = new String[]{"A", "B"};

        set3 = new String[]{"A", "B", "C"};

        set4 = new String[]{"A", "B", "C", "D"};
    }
}