package part16;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class Task161Test {

    private static int[] arr;

    public static void swapInArray(int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    @Test
    public void testSwap() throws Exception {
        arr = new int[]{3, 5};

        assertThat(arr[0], is(3));
        assertThat(arr[1], is(5));

        swapInArray(0, 1);

        assertThat(arr[0], is(5));
        assertThat(arr[1], is(3));
    }

    @Test
    public void testIntsDontSwap() throws Exception {
        int x = 5;
        int y = 3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        Task161.swap(x, y);

        System.out.println("After");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        assertNotEquals(3, x);
        assertNotEquals(5, y);
    }

    @Test
    public void testSwapI() throws Exception {
        Value a = new Value(5);
        Value b = new Value(3);

        Task161.swap(a, b);

        assertThat(a.data, is(3));
        assertThat(b.data, is(5));
    }
}