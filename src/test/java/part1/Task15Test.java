package part1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task15Test {
    private static String pale = "pale";
    private static String ple = "ple";
    private static String pales = "pales";
    private static String bale = "bale";
    private static String bake = "bake";

    @Test
    public void testOneReplacement() throws Exception {

        boolean shouldBeTrue = Task15.isOneOrLessModificationNecessary(pale, bale);
        assertThat(shouldBeTrue, is(true));
    }

    @Test
    public void testOneInsertion() throws Exception {

        boolean shouldBeTrue = Task15.isOneOrLessModificationNecessary(pale, pales);
        assertThat(shouldBeTrue, is(true));
    }

    @Test
    public void testOneDeletion() throws Exception{

        boolean shouldBeTrue = Task15.isOneOrLessModificationNecessary(pale, ple);
        assertThat(shouldBeTrue, is(true));
    }

    @Test
    public void testMoreThanOneModification() throws Exception {

        boolean shouldBeFalse = Task15.isOneOrLessModificationNecessary(pale, bake);
        assertThat(shouldBeFalse, is(false));
    }
}