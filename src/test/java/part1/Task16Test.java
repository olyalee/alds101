package part1;

import org.junit.Test;

public class Task16Test {
    private static String toShorten = "aabcccccaaa";
    private static String compressedString = "a2b1c5a3";
    private static String toRemainTheSame = "aabbcc";

    @Test
    public void testStringIsCompressed() throws Exception {

        String result = Task16.compressString(toShorten);
        assert (result.equals(compressedString));
    }

    @Test
    public void testStringIsRemainTheSame() throws Exception {

        String result = Task16.compressString(toRemainTheSame);
        assert (result.equals(toRemainTheSame));
    }

    @Test
    public void testEmptyString() throws Exception {

        String string = Task16.compressString("");
        assert(string.equals(""));
    }
}