package part16;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task161Test {

    @Test
    public void testSwapI() throws Exception {
        Value a = new Value(5);
        Value b = new Value(3);

        Task161.swap(a, b);

        assertThat(a.data, is(3));
        assertThat(b.data, is(5));
    }
}