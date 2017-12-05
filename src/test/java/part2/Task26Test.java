package part2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task26Test {

    @Test
    public void testIsPalindrome() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("a");

        boolean isPalindrome = Task26.isPalindrome(list);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsNotPalindrome() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("a");

        boolean isPalindrome = Task26.isPalindrome(list);
        assertFalse(isPalindrome);
    }
}