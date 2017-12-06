package part2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

public class Task24Test {
    private static LinkedList<Integer> list;

    @BeforeClass
    public static void setUp() {
        list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

    }

    @Test
    public void testSplitList() throws Exception {
        LinkedList<Integer> splittedList = Task24.splitList(list, 5);

        splittedList.forEach(element -> System.out.println(element));
    }
}