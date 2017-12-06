package part3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class Task32Test {

    @Test
    public void testStackUsage() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(12);

        assertThat(stack.min(), is(1));
        assertThat(stack.peek(), is(12));
    }
}