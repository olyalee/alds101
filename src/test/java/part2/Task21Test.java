package part2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task21Test {

    public static LinkedList<Integer> list = new LinkedList<>();

    @BeforeClass
    public static void setUp(){
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(4);
    }

    @Test
    public void testRemoveDuplicates() throws Exception {
        LinkedList listWith3Elements = Task21.removeDuplicates(list);
        assertThat(listWith3Elements.size(), is(3));
        assertThat(listWith3Elements.get(0), is(1));
        assertThat(listWith3Elements.get(1), is(4));
        assertThat(listWith3Elements.get(2), is(5));
    }

    @Test
    public void testRemoveDuplicatesWithoutBuffer() throws Exception {
        LinkedList listWith3Elements = Task21.removeDuplicatesWithoutBuffer(list);
        assertThat(listWith3Elements.size(), is(3));
        assertThat(listWith3Elements.get(0), is(1));
        assertThat(listWith3Elements.get(1), is(4));
        assertThat(listWith3Elements.get(2), is(5));
    }
}