package part2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task25Test {
    private static LinkedList<Integer> first = new LinkedList<>();
    private static LinkedList<Integer> second = new LinkedList<>();

    @BeforeClass
    public static void setUp(){
        first.add(7);
        first.add(1);
        first.add(6);
        second.add(5);
        second.add(9);
        second.add(2);
    }

    @Test
    public void testLinkedListsSum() throws Exception {
        LinkedList<Integer> sumUpList = Task25.linkedListSum(first, second);

        assertThat(sumUpList.size(), is(3));
        assertThat(sumUpList.get(0),is(2));

    }
}