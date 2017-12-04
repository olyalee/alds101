package part1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task14Test {
    public static String palindrome = "Tact Coa";
    public static String nonPalindrome = "Test Case";

    @Test
    public void testIsNotPalindrome() throws Exception {

        boolean shouldBeFalse = Task14.isPalindromeTransposition(nonPalindrome);
        assertThat(shouldBeFalse, is(false));
    }

    @Test
    public void testIsPalindrome() throws Exception {

        boolean shouldBeTrue = Task14.isPalindromeTransposition(palindrome);
        assertThat(shouldBeTrue, is(true));
    }
}