package part1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task12Test {
    public static String test = "test";
    public static String shorter = "set";
    public static String transposition = "stet";
    public static String nonTransposition = "tost";

    @Test
    public void testWordsHaveDifferentLength() throws Exception {

        boolean result = Task12.isTransposition(test, shorter);
        assertThat(result, is(false));
    }

    @Test
    public void testWordHasSameLengthButIsNotTransposition() throws Exception {

        boolean result = Task12.isTransposition(test, nonTransposition);
        assertThat(result, is(false));
    }

    @Test
    public void testWordIsTransposition() throws Exception {

        boolean result = Task12.isTransposition(test, transposition);
        assertThat(result, is(true));
    }
}
