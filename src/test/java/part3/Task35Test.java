package part3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task35Test {

    @Test
    public void testSortStack() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(12);

        Task35.sortStack(stack);

        assertThat(stack.peek(), is(1));
    }
}