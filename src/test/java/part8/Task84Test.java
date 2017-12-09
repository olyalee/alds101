package part8;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task84Test {
    private static HashSet<String> set2;
    private static HashSet<String> set3;
    private static HashSet<String> set4;

    @Test
    public void testGetAllSubsets() throws Exception {
        List<HashSet<String>> allSubsets2 = Task84.getAllSubsets(set2);
        List<HashSet<String>> allSubsets3 = Task84.getAllSubsets(set3);
        List<HashSet<String>> allSubsets4 = Task84.getAllSubsets(set4);

        assertEquals(3, allSubsets2.size());
        assertEquals(7, allSubsets3.size());
        assertEquals(13, allSubsets4.size());
    }

    @Before
    public void setUp() throws Exception {
        set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");

        set3 = new HashSet<>();
        set3.add("A");
        set3.add("B");
        set3.add("C");

        set4 = new HashSet<>();
        set4.add("A");
        set4.add("B");
        set4.add("C");
        set4.add("D");
    }
}